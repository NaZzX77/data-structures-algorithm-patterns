package BinarySearch;

import java.util.Arrays;

//GFG Aggressive Cows Problem
//https://www.geeksforgeeks.org/problems/aggressive-cows/1
public class AggressiveCows {
    static void main(String[] args) {
        System.out.println(aggressiveCows(new int[]{10, 1, 2, 7, 5},3));
    }
    public static  int aggressiveCows(int[] arr,int k){
        Arrays.sort(arr);
        int low=1;
        int high=arr[arr.length-1]-arr[0];
        int minMax=low;  //just for reference to understand high actually stores this value.
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canPlaceCows(arr,k,mid)){
                if(mid>minMax){
                    minMax=mid;
                }
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return minMax;
    }
    public static  boolean canPlaceCows(int[] arr,int k,int d){
        int ans=1;
        int lastPlaced=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]-lastPlaced>=d){
                ans++;
                lastPlaced=arr[i];
            }
        }
        return ans>=k;
    }
}
