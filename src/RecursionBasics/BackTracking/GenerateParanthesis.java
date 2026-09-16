package RecursionBasics.BackTracking;
import java.util.*;
//https://leetcode.com/problems/generate-parentheses/
public class GenerateParanthesis {
    static void main(String[] args) {
        System.out.println(generate(3,0,0,new ArrayList<>(),new StringBuilder()));
    }
    static List<String> generate(int n,int open,int count,List<String> res,StringBuilder sb){
        if(count==n && open==0){
            res.add(sb.toString());
            return res;
        }
        if(count < n && open == 0){
            sb.append("(");
            generate(n,open+1,count,res,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        else if(count < n - open && open>0){
            sb.append('(');
            generate(n,open+1,count,res,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(open>0){
            sb.append(')');
            generate(n,open-1,count+1,res,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        return res;
    }
}
