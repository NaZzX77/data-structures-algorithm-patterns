package RecursionBasics.BackTracking;
import java.util.*;
public class CombinationSum {
    static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2,3,6,7},7));
    }
    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        return helper(candidates,target,0,0,new ArrayList<>(),new ArrayList<>());
    }
    static List<List<Integer>> helper(int[] candidates,int target,int sum,int index,List<Integer> curr,
                                      List<List<Integer>> res){
        if(sum>target){
            return res;
        }
        if(sum==target){
            res.add(new ArrayList<>(curr));
            return res;
        }
        for(int i=index;i<candidates.length;i++){
            curr.add(candidates[i]);
            helper(candidates,target,sum+candidates[i],i,curr,res);
            curr.remove(curr.size()-1);
        }
        return res;
    }
}
