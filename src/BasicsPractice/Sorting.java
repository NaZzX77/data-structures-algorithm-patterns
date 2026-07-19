package BasicsPractice;

import java.util.Arrays;

public class Sorting {
    static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{34,2,34,12,0,9,99,102,23})));
        System.out.println(Arrays.toString(selectionSort(new int[]{34,2,34,12,0,9,99,102,23})));
        System.out.println(Arrays.toString(insertionSort(new int[]{34,2,34,12,0,9,99,102,23})));
        System.out.println(Arrays.toString(mergeSort(new int[]{34,2,34,12,0,9,99,102,23})));
        System.out.println(Arrays.toString(quickSort(new int[]{34,2,34,12,0,9,99,102,23})));

    }
    static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int maxIndex=0;
            for (int j = 0; j < arr.length-i; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp=arr[maxIndex];
            arr[maxIndex]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;

        }
        return arr;
    }
    static int[] insertionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else {
                    break;
                    //to save iteration where swap wont happen either ways.
                }
            }
        }
        return arr;
    }
    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    static int[] merge(int[]  first ,int[] second){
        int[] merged=new int[first.length+second.length];
        int f=0;
        int s=0;
        int m=0;
        while(f<first.length && s<second.length){
            if(first[f]<second[s]){
                merged[m++]=first[f++];
            }
            else{
                merged[m++]=second[s++];
            }
        }
        while(f<first.length){
            merged[m++]=first[f++];
        }
        while(s< second.length){
            merged[m++]=second[s++];
        }
        return merged;
    }
    static int[] quickSort(int[] arr){
        helper(arr, 0, arr.length - 1);
        return arr;
    }
    static void helper(int[] arr, int start, int end){
        if(start >= end){
            return;
        }
        int low = start;
        int high = end;
        int pivot = arr[(start + end) / 2];

        while(low <= high){
            while(arr[low] < pivot){
                low++;
            }

            while(arr[high] > pivot){
                high--;
            }

            if(low <= high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

                low++;
                high--;
            }
        }
        helper(arr, start, high);
        helper(arr, low, end);
    }
}
