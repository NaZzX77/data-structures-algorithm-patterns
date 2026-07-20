package BinarySearch;

public class NumberOfOccurences {
    static void main(String[] args) {
        System.out.println(countOccurences(new int[]{1, 1, 2, 2, 2, 2, 3},2));
        System.out.println(countFreq(new int[]{1, 1, 2, 2, 2, 2, 3},2));
    }
    //First though was linear Search that was O(n).
    static int countFreq(int[] arr, int target) {
        return binarySearch(arr, target, 0, arr.length - 1);
    }
    // The second approach that came to mind was recursion because this problem can be broken down into smaller problems.
    //once we find the target we can apply binary search on left and right part of the target.
    static int binarySearch(int[] arr, int target, int s, int e) {
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] == target) {
                int l = binarySearch(arr, target, s, m - 1);
                int r = binarySearch(arr, target, m + 1, e);
                return 1 + l + r;
            }
            if (arr[m] < target) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return 0;
    }
    // Then I realised that recursive calls will need O(log n) space
    // and the worst-case time complexity becomes O(n).
    // By using recursion i lost the O(log n) time complexity property of binary search.
    // So thought of another way to count and realised that
    // (lastIndex - firstIndex + 1) gives the count of the target.
    static int countOccurences(int[] arr,int target){
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
        return (leftMostIndex == -1 || rightMostIndex == -1) ? 0 : rightMostIndex - leftMostIndex + 1;
    }
}
