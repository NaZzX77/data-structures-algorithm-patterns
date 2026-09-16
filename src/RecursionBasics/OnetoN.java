package RecursionBasics;

public class OnetoN {
    static void main(String[] args) {
        oneToN(5);
    }
    static void oneToN(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        oneToN(n-1);
        System.out.println(n);

    }
}
