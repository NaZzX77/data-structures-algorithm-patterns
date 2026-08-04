package SlidingWindow;

import java.util.HashMap;

//https://leetcode.com/problems/fruit-into-baskets/description/
public class FruitIntoBaskets {
    static void main(String[] args) {
        System.out.println(fruitIntoBaskets(new int[]{1,2,3,2,2}));
    }
    static int fruitIntoBaskets(int[] arr){
        int maxLength=-1;
        int left=0;
        int right=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        while(right<arr.length){
            hm.put(arr[right],hm.getOrDefault(arr[right],0)+1);
            while(hm.size()>2){
                int value=hm.get(arr[left]);
                if(value>1){
                    hm.put(arr[left],value-1);
                }
                else{
                    hm.remove(arr[left]);
                }
                left++;
            }
            maxLength=Math.max(maxLength,right-left+1);
            right++;
        }
        return maxLength;
    }
}
