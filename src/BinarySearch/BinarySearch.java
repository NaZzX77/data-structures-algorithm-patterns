package BinarySearch;

public class BinarySearch {
    static void main(String[] args) {
        System.out.println(binarySearch(new int[]{3,5,7,10,30,40,50,60},30));
    }
    //returns the index of the item if found,if not found returns -1;
    static int binarySearch(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;        //used this expression of mid to avoid int overflow error;
            if(arr[m]==target){
                return m;
            }
            if(arr[m]<target){
                s=m+1;
            }
            //else here represents arr[m]>target    , so we skip the right parts as the data is monotonic.
            else{
                e=m-1;
            }
        }
        return -1;
    }
}
