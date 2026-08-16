package PrefixSum;
import java.util.HashMap;
//https://leetcode.com/problems/contiguous-array/description/
public class ContigousArray {
    static void main(String[] args) {
        System.out.println(findMaxLength(new int[]{0,1,1,1,1,1,0,0,0}));
    }
    static int findMaxLength(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0)
                nums[i] = -1;
        }
        int maxLength=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        int ps=0;
        for(int i=0;i<nums.length;i++){
            ps+=nums[i];
            if(hm.containsKey(ps)){
                maxLength=Math.max(maxLength,i-hm.get(ps));
            }
            if(!hm.containsKey(ps)){
                hm.put(ps,i);
            }
        }
        return maxLength;
    }
}
