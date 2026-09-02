package Heap.phase1;
import java.util.*;
public class TopKFrequentElements {
    static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1,1,1,2,2,3},2)));
    }
    static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b) -> Integer.compare(a[1],b[1]));
        for(Integer i:hm.keySet()){
            pq.add(new int[]{i,hm.get(i)});
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            int[] get=pq.poll();
            ans[i]=get[0];
        }
        return ans;
    }
}
