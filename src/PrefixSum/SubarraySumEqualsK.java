package PrefixSum;
import java.util.*;
public class SubarraySumEqualsK {
    static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,1,1},2));
    }
    static int subarraySum(int[] nums, int k) {
        int ps=0;
        int count =0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0, 1);
        for(int i=0;i<nums.length;i++){
            ps+=nums[i];
            int needed=ps-k;
            if (hm.containsKey(needed)){
                count+=hm.get(needed);
            }
            hm.put(ps,hm.getOrDefault(ps,0)+1);
        }
        return count;
    }
}
