package Heap.phase1;
import java.util.*;
public class KthLargest {
    static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{56,76,2,4,5,6},2));
    }
    static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
