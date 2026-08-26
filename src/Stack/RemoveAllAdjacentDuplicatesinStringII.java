package Stack;
import java.util.*;
//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/description/
public class RemoveAllAdjacentDuplicatesinStringII {
    static void main(String[] args) {
        System.out.println(removeDuplicates("aaabbbcccdd",3));
        System.out.println(removeDuplicates("pbbcggttciiippooaais",2));
        System.out.println(removeDuplicates("abcd",1));
    }
    static String removeDuplicates(String s, int k) {
        if (k==1){
            return "";
        }
        Stack<Character> st=new Stack<>();
        Stack<Integer> count=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
                count.push(1);
            }
            else{
                if(s.charAt(i)==st.peek()){
                    int oldCount=count.pop();
                    count.push(oldCount+1);
                    st.push(s.charAt(i));
                }
                else{
                    st.push(s.charAt(i));
                    count.push(1);
                }
                if(count.peek()==k){
                    for(int j=0;j<k;j++){
                        st.pop();
                    }
                    count.pop();
                }

            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
