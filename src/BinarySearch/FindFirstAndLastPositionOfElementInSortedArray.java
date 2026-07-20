package BinarySearch;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,10},8)));
    }
    public static  int[] searchRange(int[] arr, int target) {
        int leftMostIndex=-1;
        int rightMostIndex=-1;
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==target){
                leftMostIndex=m;
                e=m-1;
            }
            else if(arr[m]<target){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        //reset because using the variables again .if different names used no need to reset it .
        s=0;
        e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==target){
                rightMostIndex=m;
                s=m+1;
            }
            else if(arr[m]<target){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return new int[]{leftMostIndex,rightMostIndex};
    }
}
