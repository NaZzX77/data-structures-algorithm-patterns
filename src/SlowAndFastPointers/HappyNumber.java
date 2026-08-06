package SlowAndFastPointers;

public class HappyNumber {
    static void main(String[] args) {
        System.out.println(happyNumber(19));
    }
    static boolean happyNumber(int n){
        int slow=helper(n);
        int fast=helper(helper(n));
        boolean happy=false;
        while(fast!=1 && slow!=fast){
            slow=helper(slow);
            fast=helper(fast);
            fast=helper(fast);
        }
        return fast==1;
    }
    static int helper(int n){
        int sum=0;
        while(n!=0){
            int digit=n%10;
            n=n/10;
            sum+=digit*digit;
        }
        return sum;
    }
}
