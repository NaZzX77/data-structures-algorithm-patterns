package SlidingWindow;
//https://leetcode.com/problems/max-consecutive-ones-iii/
public class LongestOnes {
    static void main(String[] args) {
        System.out.println(longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0},2));
    }
    public static int longestOnes(int[] nums, int k) {
        int[] freq=new int[2];
        int left=0;
        int right=0;
        int maxLength=0;
        while(right<nums.length){
            freq[nums[right]]++;
            while(freq[0]>k){
                freq[nums[left]]--;
                left++;
            }
            maxLength=Math.max(maxLength,right-left+1);
            right++;
        }
        return maxLength;
    }
}
