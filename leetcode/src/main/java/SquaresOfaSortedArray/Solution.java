package SquaresOfaSortedArray;

public class Solution {

    public static void main(String[] args) {
        sortedSquares(new int[]{-4,-1,0,3,10});
    }

    public static int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];

        int start = 0;
        int end = nums.length - 1;

        int index = end;

        while (start <= end) {
            if (Math.abs(nums[start]) > Math.abs(nums[end])) {
                arr[index--] = nums[start] * nums[start++];
            }
            else {
                arr[index--] = nums[end] * nums[end--];
            }
        }


        return arr;
    }

}
