package RecursionBasics;

public class NToOne {
    static void main(String[] args) {
        nToOne(5);
    }
    static void nToOne(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        nToOne(n-1);
    }
}
