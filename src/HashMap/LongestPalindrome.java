package HashMap;
import java.util.HashMap;
public class LongestPalindrome {
    static void main(String[] args) {
        System.out.println(longestPalindrome("leetcode"));
        System.out.println(longestPalindrome("neeshithneeshith"));
    }

    public static  int longestPalindrome(String s) {
        HashMap<Character,Integer> have=new HashMap<>();
        char[] chars=s.toCharArray();
        for(char ch:chars){
            if(have.containsKey(ch)){
                int value=have.get(ch);
                have.put(ch,value+1);
            }
            else{
                have.put(ch,1);
            }
        }
        int countLongestLength=0;
        boolean oddPalindrome=false;
        for(Character key:have.keySet()){
            int value=have.get(key);
            int curr=value/2;
            countLongestLength+=curr*2;
            have.put(key,value/2);
            if(value%2==1){
                oddPalindrome=true;
            }
        }
        if(oddPalindrome){
            countLongestLength=countLongestLength+1;
        }
        return countLongestLength;
    }
}
