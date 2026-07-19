package TwoPointer;

import java.util.Arrays;
import java.util.Scanner;

public class StonexPrac {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the input");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int n1=sc.nextInt();
            arr[i]=n1;
        }
        System.out.println("Enter the target sum");
        int target=sc.nextInt();
        twoPointer(arr,target);
    }
    static void twoPointer(int[] arr,int target){
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.println("YES");
                return;
            }
            if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println("NO");
    }
}
