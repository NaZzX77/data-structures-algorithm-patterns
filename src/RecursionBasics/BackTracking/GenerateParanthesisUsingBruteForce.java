package RecursionBasics.BackTracking;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesisUsingBruteForce {
    static void main(String[] args) {
        System.out.println(generate(2,0,0,new ArrayList<>(),""));
    }
    static List<String> generate(int n,int o,int c,List<String> res,String curr){
        if(o==c && o==n){
            if(isValid(curr)){
                res.add(curr);

            }
            return res;
        }
        if(o<n){
            generate(n,o+1,c,res,curr+'(');
        }
        if(c<n){
            generate(n,o,c+1,res,curr+')');
        }
        return res;
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
