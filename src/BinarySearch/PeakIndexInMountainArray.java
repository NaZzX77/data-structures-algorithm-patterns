package BinarySearch;

public class PeakIndexInMountainArray {
    static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int[]{0,2,5,8,12,8,4,1}));
    }
    static int peakIndexInMountainArray(int[] arr){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int m=s+(e-s)/2;
            if(arr[m]>arr[m+1]){
                e=m;
            }
            else{
                s=m+1;
            }
        }
        return s;
    }
}
