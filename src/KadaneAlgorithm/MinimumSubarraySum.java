package KadaneAlgorithm;
//https://www.geeksforgeeks.org/problems/smallest-sum-contiguous-subarray/1
public class MinimumSubarraySum {
    static void main(String[] args) {
        System.out.println(minimumSubarraySum(new int[]{3,-4, 2,-3,-1, 7,-5},7));
    }
    static int minimumSubarraySum(int a[], int size){
        int min=a[0];
        int curr=a[0];
        for(int i=1;i<size;i++){
            curr=Math.min(a[i],curr+a[i]);
            min=Math.min(curr,min);
        }
        return min;
    }
}
