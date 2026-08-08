package KadaneAlgorithm;
//https://leetcode.com/problems/maximum-subarray/description/
public class MaximumSubarraySum {
    static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    static int maxSubArray(int[] nums) {
        int max=nums[0];
        int curr=nums[0];
        for(int i=1;i<nums.length;i++){
            curr=Math.max(nums[i],curr+nums[i]);
            max=Math.max(curr,max);
        }
        return max;
    }
}
