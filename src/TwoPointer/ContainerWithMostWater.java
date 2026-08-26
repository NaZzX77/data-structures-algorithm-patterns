package TwoPointer;
public class ContainerWithMostWater {
    static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(maxArea(new int[]{1,1}));
    }
    static int maxArea(int[] height) {
        int maxArea=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int area=(right-left) * Math.min(height[left],height[right]);
            maxArea=Math.max(area,maxArea);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}
