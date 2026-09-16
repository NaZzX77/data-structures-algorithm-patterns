package RecursionBasics.BackTracking;
import java.util.*;
public class Permuations {
    static void main(String[] args) {
        System.out.println(permute(new int[]{1,2,3}));
    }
    static List<List<Integer>> permute(int[] nums) {
        List<Integer> unused = new ArrayList<>();
        for (int num : nums) {
            unused.add(num);
        }
        return helper(nums,unused,0,new ArrayList<>(),new ArrayList<>());
    }
    static List<List<Integer>> helper(int[] nums,List<Integer> unused,int index,List<Integer> curr,List<List<Integer>> res){
        if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
            return res;
        }
        for(int i=0;i<unused.size();i++){
            Integer x = unused.get(i);
            curr.add(x);
            unused.remove(i);
            helper(nums, unused, index+1, curr, res);
            curr.remove(x);
            unused.add(i,x);
        }
        return res;
    }
}
