package RecursionBasics.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {
    static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
    static String[] arr={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static List<String> letterCombinations(String s){
        return helper(s,0,new StringBuilder(),new ArrayList<>());
    }
    static List<String> helper(String s,int index,StringBuilder curr,List<String> res){
        if(curr.length()==s.length()){
            res.add(curr.toString());
            return res;
        }
        int in=s.charAt(index)-'0';
        String digits=arr[in];
        for(int i=0;i<digits.length();i++){
            curr.append(digits.charAt(i));
            helper(s,index+1,curr,res);
            curr.deleteCharAt(curr.length()-1);
            //helper(s,index+1,curr,res);
        }
        return res;
    }
}
