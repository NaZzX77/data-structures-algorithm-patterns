package HashMap;

import java.util.HashMap;

public class MaxNumberOfBalloons {
    static void main(String[] args) {
        int ans=maxNumberOfBalloons("loonbalxballpoon");
        System.out.println(ans);
        System.out.println(maxNumberOfBalloons("leetcode"));
    }
    static int maxNumberOfBalloons(String text){
        int min=0;
        char[] chars = text.toCharArray();
        HashMap<Character,Integer> have=new HashMap<>();
        for(char ch:chars){
            if(have.containsKey(ch)){
                int value=have.get(ch);
                have.put(ch,value+1);
            }
            else{
                have.put(ch,1);
            }
        }
        int b,a,l,o,n;
        if(have.containsKey('b')){
            b=have.get('b');
        }
        else{
            return 0;
        }
        if(have.containsKey('a')){
            a=have.get('a');
        }
        else{
            return 0;
        }
        if(have.containsKey('l')){
            l=have.get('l')/2;
        }
        else{
            return 0;
        }
        if(have.containsKey('o')){
            o=have.get('o')/2;
        }
        else{
            return 0;
        }
        if(have.containsKey('n')){
            n=have.get('n');
        }
        else{
            return 0;
        }
        min=Math.min(a,Math.min(b,Math.min(l,Math.min(o,n))));
        return min;
    }
}
