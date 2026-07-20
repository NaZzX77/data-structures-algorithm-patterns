package BinarySearch;
//Geeks for geeks Ceil in a sorted array problem
public class CeilingInSortedArray {
    static void main(String[] args) {
        System.out.println(ceilingInSortedArray(new int[]{1, 2, 8, 10, 11, 12, 19},5));
    }
    static int ceilingInSortedArray(int[] arr,int x){
        int ans=-1;
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            // If arr[m] >= x, arr[m] is a possible ceiling.
            // Store its index and continue searching left for a smaller valid ceiling.
            if(arr[m]>=x){
                ans=m;
                e=m-1;
            }
            //else represents when arr[m]<x
            else{
                s=m+1;
            }
        }
        return ans;
    }
}
