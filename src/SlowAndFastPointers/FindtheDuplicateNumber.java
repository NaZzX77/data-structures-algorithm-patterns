package SlowAndFastPointers;

public class FindtheDuplicateNumber {
    static void main(String[] args) {
        System.out.println(findtheDuplicateNumber(new int[]{1,3,4,2,2}));
    }
    static int findtheDuplicateNumber(int[] arr){
        int slow=arr[0];
        int fast=arr[arr[0]];
        while(slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
            fast=arr[fast];
        }
        slow=0;
        while(slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
        }
        return slow;
    }
}
