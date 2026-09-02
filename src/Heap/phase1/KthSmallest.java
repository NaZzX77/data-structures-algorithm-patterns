package Heap.phase1;
import java.util.*;
public class KthSmallest {
    static void main(String[] args) {
        System.out.println(kthSmallest(new int[]{56,76,2,4,5,6},2));
        System.out.println(KthSmallestOptimised(new int[]{56,76,2,4,5,6},2));
    }
    static int kthSmallest(int[] arr, int k) {
        int ans=0;
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        for(int i=0;i<k;i++){
            ans=pq.poll();
        }
        return ans;
    }
    static int KthSmallestOptimised(int[] arr,int k){
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
