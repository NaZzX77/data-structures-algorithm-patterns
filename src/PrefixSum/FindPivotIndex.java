package PrefixSum;

public class FindPivotIndex {
    static void main(String[] args) {
        System.out.println(findPivotIndex(new int[]{1,7,3,6,5,6}));
        System.out.println(pivotIndex (new int[]{1,7,3,6,5,6}));
    }
    static int pivotIndex(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int pivotIndex=-1;
        int[] ps=new int[nums.length];
        ps[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            ps[i]=ps[i-1]+nums[i];
        }
        int n=nums.length-1;
        int[] ss=new int[nums.length];
        ss[n]=nums[n];
        for(int i=n-1;i>=0;i--){
            ss[i]=ss[i+1]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(i==0 && ss[i+1]==0 || i==n && ps[i-1]==0){
                pivotIndex=i;
                break;
            }
            else if((i>0 && i<n)  && ps[i-1]==ss[i+1]){
                pivotIndex=i;
                break;
            }

        }
        return pivotIndex;
    }
    static int findPivotIndex(int[] nums){
        if(nums.length==1){
            return 0;
        }
        int totalSum=0;
        for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
        }
        int rs=0;
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            if(rs==totalSum-rs-nums[i]){
                return i;
            }
            rs+=nums[i];

        }
        return ans;
    }
}
