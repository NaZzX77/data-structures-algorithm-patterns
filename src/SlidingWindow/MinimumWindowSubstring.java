package SlidingWindow;
import java.util.*;
//https://leetcode.com/problems/minimum-window-substring/
public class MinimumWindowSubstring {
    static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC","ABC"));
    }
    static String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        boolean possible=false;
        int minLength=Integer.MAX_VALUE;
        String ansS="";
        int left=0;
        int right=0;
        HashMap<Character,Integer> ans=new HashMap<>();
        HashMap<Character,Integer> wantToBeValid=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            wantToBeValid.put(c,wantToBeValid.getOrDefault(c,0)+1);
        }
        while(right<s.length()){
            char c=s.charAt(right);

            ans.put(c,ans.getOrDefault(c,0)+1);
            while(isValid(ans,wantToBeValid)){
                possible=true;
                if(right-left+1<minLength){
                    minLength=right-left+1;
                    ansS=s.substring(left,right+1);
                }
                //minLength=Math.min(minLength,right-left+1);
                int value=ans.get(s.charAt(left));
                if(value>1){
                    ans.put(s.charAt(left),value-1);
                }
                else{
                    ans.remove(s.charAt(left));
                }
                left++;
            }
            right++;
        }
        if(!possible){
            return "";
        }
        return ansS;
    }
    static boolean isValid(HashMap<Character,Integer> h1,HashMap<Character,Integer> h2){
        //int ans=true;
        for(Character c:h2.keySet()){
            if(h1.containsKey(c)){
                int have=h1.get(c);
                int need=h2.get(c);
                if(have>=need){
                    continue;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}
