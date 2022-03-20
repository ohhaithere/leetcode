package MaximumSubarray;

public class Solution {

    public static void main(String args[]) {
        maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    }

    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i], nums[i] + sum);
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }

}
