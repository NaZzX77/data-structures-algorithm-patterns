package Stack;
import java.util.*;
//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
public class RemoveAdjacentDuplicates {
    static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
        System.out.println(removeDuplicates("azxxzy"));
        System.out.println(removeDuplicates("abcd"));
        System.out.println(removeDuplicates("bbb"));
    }
    static String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)!=st.peek()){
                st.push(s.charAt(i));
            }
            else{
                if(!st.isEmpty()){
                    st.pop();
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            char c=st.pop();
            sb.append(c);
        }
        sb.reverse();
        return sb.toString();
    }
}
