package Heap.phase1;
import java.util.*;
class Pair{
    String word;
    int freq;
    Pair(String s,int i){
        word=s;
        freq=i;
    }
}
public class TopKFrequentWords {
    static void main(String[] args) {
        System.out.println(topKFrequent(new String[]{"i","love","leetcode","i","love","coding"},2));
    }
    static List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> hm=new HashMap<>();
        for(int i=0;i<words.length;i++){
            hm.put(words[i],hm.getOrDefault(words[i],0)+1);
        }
        List<String> ans=new ArrayList<>();
        PriorityQueue<Pair> pq= new PriorityQueue<>((a,b)->
        {
            if(a.freq!=b.freq)
                return a.freq-b.freq;
            return b.word.compareTo(a.word);
        }
        );
        for(String s:hm.keySet()){
            pq.add(new Pair(s,hm.get(s)));
            if(pq.size()>k){
                pq.poll();
            }
        }
        for(int i=0;i<k;i++){
            Pair obj=pq.poll();
            ans.add(obj.word);
        }
        Collections.reverse(ans);
        return ans;
    }
}
