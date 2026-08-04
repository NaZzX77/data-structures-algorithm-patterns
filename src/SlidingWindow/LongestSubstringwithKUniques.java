package SlidingWindow;

import java.util.HashMap;

//https://www.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1
public class LongestSubstringwithKUniques {
    static void main(String[] args) {
        System.out.println(longestSubstringwithKUniques("aabacbebebe",3));
    }
    static int longestSubstringwithKUniques(String s,int k){
        boolean possible=false;
        int maxLength=Integer.MIN_VALUE;
        int left=0;
        int right=0;
        HashMap<Character,Integer> distinct = new HashMap<>();
        while(right<s.length()){
            distinct.put(s.charAt(right),distinct.getOrDefault(s.charAt(right),0)+1);
            while(distinct.size()>k){
                char l=s.charAt(left);
                if(distinct.containsKey(l)){
                    int value=distinct.get(l);
                    if(value>1){
                        distinct.put(l,value-1);
                    }
                    else{
                        distinct.remove(l);
                    }
                }
                left++;
            }
            if(distinct.size()==k){
                possible=true;
                maxLength=Math.max(maxLength,right-left+1);
            }
            right++;
        }
        if(!possible){
            return -1;
        }
        return maxLength;
    }
}
