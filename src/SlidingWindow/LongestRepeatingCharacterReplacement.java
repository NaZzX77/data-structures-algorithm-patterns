package SlidingWindow;
//https://leetcode.com/problems/longest-repeating-character-replacement/description/
import java.util.HashMap;
public class LongestRepeatingCharacterReplacement {
    static void main(String[] args) {
        System.out.println(longestRepeatingCharacterReplacement("AABABBA",1));
    }
    static int longestRepeatingCharacterReplacement(String s, int k){
        int left=0;
        int right=0;
        int maxLength=0;
        HashMap<Character,Integer> have=new HashMap<>();
        while(right<s.length()){
            char c=s.charAt(right);
            have.put(c,have.getOrDefault(c,0)+1);
            while(right-left+1-getMaxFreq(have)>k){
                int value=have.get(s.charAt(left));
                if(value>1){
                    have.put(s.charAt(left),value-1);
                }
                else{
                    have.remove(s.charAt(left));
                }
                left++;
            }
            maxLength=Math.max(maxLength,right-left+1);
            right++;
        }
        return maxLength;
    }
    static int getMaxFreq(HashMap<Character,Integer> have){
        int maxValue=Integer.MIN_VALUE;
        for(Integer i:have.values()){
            maxValue=Math.max(maxValue,i);
        }
        return maxValue;
    }
}
