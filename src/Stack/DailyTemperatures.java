package Stack;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    static void main(String[] args) {
        System.out.println(Arrays.toString(dailyNext(new int[]{30,40,50,60})));
    }
    static int[] dailyNext(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> stack =new Stack<>();
        for (int i = arr.length-1; i >=0; i--) {
            if(stack.isEmpty()){
                stack.push(i);
                ans[i]=0;
            }
            else{
                while(!stack.isEmpty()){
                    if(arr[i]<=arr[stack.peek()]){
                        stack.pop();
                    }
                    else{
                        ans[i]=stack.peek()-i;
                        stack.push(i);
                    }
                }
                if(stack.isEmpty()){
                    ans[i]=0;
                }
            }
        }
        return ans;
    }
}
