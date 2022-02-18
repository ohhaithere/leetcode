package ContainerWithMostWater;

public class Solution {

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;

        int max = 0;

        while(left < right) {
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }

    public static void main(String args[]) {

        maxArea(new int[]{ 1,2,3,4,5,6,7,8,9,10 } );
    }

}
