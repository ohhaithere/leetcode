package HouseRobber2;

import java.util.Arrays;

public class Solution {


    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int loot1 = calculate(Arrays.copyOfRange(nums, 0, nums.length-1));
        int loot2 = calculate(Arrays.copyOfRange(nums, 1, nums.length));
        return Math.max(loot1, loot2);
    }

    public int calculate(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] result = new int[nums.length];
        result[0] = nums[0];
        result[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            result[i] = Math.max(result[i - 1], result[i - 2] + nums[i]);
        }
        return result[result.length - 1];
    }

}
