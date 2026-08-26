package PrefixSum;
import java.util.*;
public class SubarraySumsDivisiblebyK {
    static void main(String[] args) {
        System.out.println(subarraysDivByK(new int[]{4,5,0,-2,-3,1},5));
    }
    static int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int ps=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            ps+=nums[i];
            int rem = ps % k;
            if(rem < 0){
                rem += k;
            }
            if(hm.containsKey(rem)){
                count+=hm.get(rem);
            }
            hm.put(rem,hm.getOrDefault(rem,0)+1);
        }
        return count;
    }
}
