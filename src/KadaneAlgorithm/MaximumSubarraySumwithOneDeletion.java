package KadaneAlgorithm;

public class MaximumSubarraySumwithOneDeletion {
    static void main(String[] args) {
        System.out.println(maximumSubarraySumwithOneDeletion(new int[]{1,-2,0,3}));
    }
    static int maximumSubarraySumwithOneDeletion(int[] arr){
        int curr=arr[0];
        int max=arr[0];
        int deletedCurr=0;
        for (int i = 1; i < arr.length; i++) {
            deletedCurr=Math.max(curr,deletedCurr+arr[i]);
            curr=Math.max(arr[i],curr+arr[i]);
            max=Math.max(max,Math.max(deletedCurr,curr));
        }
        return max;
    }
}
