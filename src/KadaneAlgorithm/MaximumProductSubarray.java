package KadaneAlgorithm;
//https://leetcode.com/problems/maximum-product-subarray/description/
public class MaximumProductSubarray {
    static void main(String[] args) {
        System.out.println(maximumProductSubarray(new int[]{2,3,-2,4}));
    }
    static int maximumProductSubarray(int[] arr){
        int currMin=arr[0];
        int currMax=arr[0];
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<0){
                int temp=currMax;
                currMax=currMin;
                currMin=temp;
            }
            currMax=Math.max(arr[i],arr[i]*currMax);
            currMin=Math.min(arr[i],arr[i]*currMin);
            max=Math.max(max,currMax);
        }
        return max;
    }
}
