package BinarySearch;

import java.util.Arrays;

public class FindMinimumInRotatedSortedArray {
    static void main(String[] args) {
        System.out.println(findMinimumInRotatedSortedArray(new int[]{4,5,6,7,0,1,2}));
    }
    static int findMinimumInRotatedSortedArray(int[] arr){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int m=s+(e-s)/2;
            if(arr[m]<arr[e]){
                e=m;
            }
            else{
                s=m+1;
            }
        }
        return arr[s];
    }
}
