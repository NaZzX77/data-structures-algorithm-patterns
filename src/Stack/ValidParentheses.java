package Stack;
import java.util.*;
//https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {
    static void main(String[] args) {
        System.out.println(isValid("{()}"));
        System.out.println(isValid("{[[]]}"));
        System.out.println(isValid("{()}]"));
    }
    static boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else{
                if (st.isEmpty()) {
                    return false;
                }
                char check=st.pop();
                if(check == '(' && s.charAt(i) == ')' || check == '{' && s.charAt(i) == '}' || check == '[' && s.charAt(i) == ']'){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
