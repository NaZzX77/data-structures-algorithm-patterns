package HashMap;

import java.util.HashMap;

public class FirstUniqueCharacterInAString {
    static void main(String[] args) {
        int ans=firstUniqueCharInAString("leetcode");
        System.out.println(ans);
    }
    static int firstUniqueCharInAString(String input){
        char[] chars = input.toCharArray();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:chars){
            if(hm.containsKey(ch)){
                int value=hm.get(ch);
                hm.put(ch,value+1);
            }
            else{
                hm.put(ch,1);
            }
        }
        for (int i = 0; i < chars.length; i++) {
            int value=hm.get(chars[i]);
            if(value==1){
                return i;
            }
        }
        return -1;
    }
}
