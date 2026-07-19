package TwoPointer;

import java.util.Arrays;

public class SquaresOfSortedArray {
    static void main(String[] args) {
        int[] ans=sortedSquares(new int[]{-4,-3,-1,0,3,5,7,10});
        System.out.println(Arrays.toString(ans));
    }
    static int[] sortedSquares(int[] nums){
        int[] result=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int index=nums.length-1;
        while(left<=right){
            int leftSquare=nums[left]*nums[left];
            int rightSquare=nums[right]*nums[right];
            if(leftSquare>rightSquare){
                result[index]=leftSquare;
                left++;
                index--;
            }
            else{
                result[index]=rightSquare;
                right--;
                index--;
            }
        }
        return result;
    }
}
