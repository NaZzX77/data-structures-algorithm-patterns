package KadaneAlgorithm;

public class MaximumAbsoluteSumofAnySubarray {
    static void main(String[] args) {
        System.out.println(maximumAbsoluteSumofAnySubarray(new int[]{2,-5,1,-4,3,-2}));
    }
    static int maximumAbsoluteSumofAnySubarray(int[] nums){
        int maxEnding=nums[0];
        int minEnding=nums[0];
        int ans=Math.abs(nums[0]);
        for(int i=1;i<nums.length;i++){
            maxEnding=Math.max(maxEnding+nums[i],nums[i]);
            minEnding=Math.min(minEnding+nums[i],nums[i]);
            ans=Math.max(ans,Math.max(maxEnding,-minEnding));
        }
        return ans;
    }
}
