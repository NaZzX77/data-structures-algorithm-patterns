package SlidingWindow;
//https://leetcode.com/problems/minimum-size-subarray-sum/
public class MinimumSizeSubarraySum {
    static void main(String[] args) {
        System.out.println(minimumSizeSubarraySum(new int[]{2,3,1,2,4,3},7));
    }
    //returning minimum length of subarray that has a sum greater than or equal to the target given.
    static int minimumSizeSubarraySum(int[] arr,int target){
        boolean possible=false;
        int minimumLength=arr.length;
        int left=0;
        int right=0;
        int windowSum=0;
        while(right<arr.length){
            windowSum+=arr[right];
            while(windowSum>=target){
                possible=true;
                minimumLength=Math.min(minimumLength,right-left+1);
                windowSum+=-arr[left++];
            }
            right++;
        }
        if(!possible){
            return 0;
        }
        return minimumLength;
    }
}
