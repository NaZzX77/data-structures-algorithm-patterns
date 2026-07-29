package BinarySearch;
//Leetcode-875
//Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas.
// The guards have gone and will come back in h hours.
//Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile.
// If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
//Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
//Return the minimum integer k such that she can eat all the bananas within h hours.
public class KokoEatingBananas {
    static void main(String[] args) {
        System.out.println(minEeatingSpeed(new int[]{30,11,23,4,20},5));
    }
    static int minEeatingSpeed(int[] piles,int h){
        int low=1; //Minimum eating Speed
        int high=0; //to find maximum eating speed we need max no. of bananas in a single pile.
        for (int i = 0; i < piles.length; i++) {
            if(piles[i]>high){
                high=piles[i];
            }
        }
        int minAnswer=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(countHours(piles,mid)<=h){
                if(mid<minAnswer){
                    minAnswer=mid;
                }
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return minAnswer;
    }
    static long countHours(int[] piles,int k){
        long hours=0;
        for (int i = 0; i < piles.length; i++) {
            hours+=piles[i]/k;
            if(piles[i]%k!=0){
                hours++;
            }
        }
        return hours;
    }
}
