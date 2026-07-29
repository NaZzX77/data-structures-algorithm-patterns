package BinarySearch;

public class SearchInRotatedSortedArray {
    static void main(String[] args) {
        //int ans=searchInRotatedSortedArray(new int[]{4,5,6,7,0,1,2},0);
        //System.out.println(ans);
        System.out.println(searchRotatedArraySingle(new int[]{4,5,6,7,0,1,2},0));
    }
    static int searchInRotatedSortedArray(int[] arr,int target){
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
        //here s is the index of the minimum element in the array
        if(target>=arr[s] && target<=arr[arr.length-1]){
            return search(arr,target,s,arr.length-1);
        }
        else{
            return search(arr,target,0,s-1);
        }
    }
    static int search(int[] arr,int target,int s,int e){
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==target){
                return m;
            }
            if(target<arr[m]){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return -1;
    }
    static int searchRotatedArraySingle(int[] arr,int target){
        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int guess=low+(high-low)/2;

            if(arr[guess]==target){
                return guess;
            }
            // Part 1 (left side) is sorted.
            if(arr[low] <= arr[guess]){
                // Target also lies inside Part 1.
                if(target >= arr[low] && target < arr[guess]){
                    high = guess-1;
                }
                // Target must be in Part 2.
                else{
                    low = guess+1;
                }
            }
            // Otherwise guess is in Part 2 (right side),
            // which means Part 2 is sorted.
            else{
                // Target lies inside Part 2.
                if(target > arr[guess] && target <= arr[high]){
                    low = guess+1;
                }
                // Target must be in Part 1.
                else{
                    high = guess-1;
                }
            }
        }

        return -1;
    }
}
