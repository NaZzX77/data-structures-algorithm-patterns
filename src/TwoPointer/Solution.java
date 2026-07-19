package TwoPointer;

import java.util.Arrays;

class Solution {
    public static void removeDuplicates(int[] nums) {
        int pt1=0;
        int pt2=1;
        while(pt2<nums.length){
            if(nums[pt1]==nums[pt2]){

                pt2++;
                continue;
            }
            pt1++;
            nums[pt1]=nums[pt2];
            pt2++;

        }
    }

    static void main(String[] args) {
        int[] arr={1,1,2,3};
        removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));

    }
}
