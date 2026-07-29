package SlidingWindow;
//https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
public class MaxSumSubarrayOfSizeK {
    static void main(String[] args) {
        System.out.println(maxSumSubarrayOfSizeK(new int[]{100, 200, 300, 400},2));
    }
    static int maxSumSubarrayOfSizeK(int[] arr,int k){
        if (k <= 0 || k > arr.length) {
            return -1;
        }
        //lets find the first window sum
        int windowSum=0;
        for (int i = 0; i < k; i++) {
            windowSum+=arr[i];
        }
        int left=0;
        int right=k;
        int maxSum=windowSum;
        while(right<arr.length){
            windowSum+=-arr[left++]+arr[right++];
            maxSum=Math.max(windowSum,maxSum);
            //right represents the next element already otherwise we would want arr[right+1]
        }
        return maxSum;
    }
}
