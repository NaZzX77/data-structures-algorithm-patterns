package RecursionBasics;

public class FindMaxInArray {
    static void main(String[] args) {
        System.out.println(findMaxInArray(new int[]{99,23,12,55,60,10,2,3},0,Integer.MIN_VALUE));
        System.out.println(findMax(new int[]{99,23,12,55,60,10,2,3},8));
    }
    static int findMaxInArray(int[] arr,int index,int max){
        if(index==arr.length){
            return max;
        }
        if(arr[index]>max){
            return findMaxInArray(arr,index+1,arr[index]);
        }
        else{
            return findMaxInArray(arr,index+1,max);
        }
    }
    static int findMax(int[] arr,int n){
        if(n==1){
            return arr[0];
        }
        int last=arr[n-1];
        int ans=findMax(arr,n-1);
        return Math.max(last,ans);
    }
}
