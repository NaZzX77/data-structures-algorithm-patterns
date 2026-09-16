package RecursionBasics.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    static void main(String[] args) {
        List<List<Integer>> res=subset(new int[]{1,2,3},new ArrayList<>(),0);
        System.out.println(res);
    }
    static List<List<Integer>> ans=new ArrayList<>();
    static List<List<Integer>> subset(int[] arr,List<Integer> curr,int index){
        if(index==arr.length){
            ans.add(new ArrayList<>(curr));
            return ans;
        }
        curr.add(arr[index]);
        subset(arr,curr,index+1);
        curr.remove(curr.size()-1);
        subset(arr,curr,index+1);
        return ans;
    }
}
