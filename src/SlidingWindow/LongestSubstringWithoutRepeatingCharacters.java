package SlidingWindow;

import java.util.HashMap;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class LongestSubstringWithoutRepeatingCharacters {
    static void main(String[] args) {
        int ans=longestSubstringWithoutRepeatingCharacters("abcabcbb");
        System.out.println(ans);
    }
    static int longestSubstringWithoutRepeatingCharacters(String s){
        int left=0;
        int right=0;
        int maxLength=0;
        HashMap<Character,Integer> hm = new HashMap<>();
        while(right<s.length()){
            hm.put(s.charAt(right),hm.getOrDefault(s.charAt(right),0)+1);
            while(hm.get(s.charAt(right))>1){
                int value=hm.get(s.charAt(left));
                if(value>1){
                    hm.put(s.charAt(left),value-1);
                }
                else{
                    hm.remove(s.charAt(left));
                }
                left++;
            }
            maxLength=Math.max(maxLength,right-left+1);
            right++;
        }
        return maxLength;
    }
}
