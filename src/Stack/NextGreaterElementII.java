package Stack;
import java.util.*;
//https://leetcode.com/problems/next-greater-element-ii/
public class NextGreaterElementII {
    static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElements(new int[]{1,2,3,4,3})));
    }
    static int[] nextGreaterElements(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = 2 * arr.length - 1; i >= 0; i--) {
            int index = i % arr.length;
            if (i < arr.length) {
                while (!st.isEmpty()) {
                    if (st.peek() <= arr[index]) {
                        st.pop();
                    } else {
                        ans[index] = st.peek();
                        break;
                    }
                }
                if (st.isEmpty()) {
                    ans[index] = -1;
                }
                st.push(arr[index]);
            }
            else {
                while (!st.isEmpty() && st.peek() <= arr[index]) {
                    st.pop();
                }
                st.push(arr[index]);
            }
        }
        return ans;
    }
}
