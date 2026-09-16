package Heap.phase2;
import java.util.*;
public class FindKClosestElements {
    static void main(String[] args) {
        System.out.println(findClosestElements(new int[]{1,2,3,4,5},4,3));
    }
    static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{
            if(Math.abs(a - x) != Math.abs(b - x))
                return Math.abs(b-x) - Math.abs(a-x);
            return b-a;
        });
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        for(int i=0;i<k;i++){
            ans.add(pq.poll());
        }
        Collections.sort(ans);
        return ans;
    }
}
