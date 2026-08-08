package KadaneAlgorithm;

public class MaximumSumCircularSubarray {
    static void main(String[] args) {
        System.out.println(maximumSumCircularSubarray(new int[]{5,-3,5}));
    }
    static int maximumSumCircularSubarray(int[] nums){
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }
        int currMin = nums[0];
        int currMax = nums[0];
        int ans = nums[0];
        int ans2 = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currMin = Math.min(currMin + nums[i], nums[i]);
            currMax = Math.max(currMax + nums[i], nums[i]);
            ans = Math.min(currMin, ans);
            ans2 = Math.max(currMax, ans2);
        }
        if (ans2 < 0) {
            return ans2;
        }
        return Math.max(totalSum - ans, ans2);
    }
}
