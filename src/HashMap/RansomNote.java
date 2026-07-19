package HashMap;

import java.util.HashMap;

public class RansomNote {
    static void main(String[] args) {
        boolean ans=ransomNote("aa","abc");
        System.out.println(ans);
    }
    static boolean ransomNote(String ransom,String magazine){
        HashMap<Character,Integer> have=new HashMap<>();
        char[] mag=magazine.toCharArray();
        for(char ch:mag){
            if(have.containsKey(ch)){
                int value= have.get(ch);
                have.put(ch,value+1);
            }
            else{
                have.put(ch,1);
            }
        }
        char[] ran=ransom.toCharArray();
        for(char ch:ran){
            if(!have.containsKey(ch)){
                return false;
            }
            else{
                int value=have.get(ch);
                if(value==1){
                    have.remove(ch);
                }
                else{
                    have.put(ch,value-1);
                }
            }
        }
        return true;
    }
}
