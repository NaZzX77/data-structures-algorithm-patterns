package TwoPointer;
//regular algo works better just for demonstration and understanding how the algorithm works
public class SumOfArray {
    static void main(String[] args) {
        int sum=sum(new int[]{10,20,30,40,50});
        System.out.println(sum);
    }
    static int sum(int[] arr){
        int sum=0;
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            if(i==j){
                sum+=arr[i];
                break;
            }
            sum+=arr[i]+arr[j];
            i++;
            j--;
        }
        return sum;
    }
}
