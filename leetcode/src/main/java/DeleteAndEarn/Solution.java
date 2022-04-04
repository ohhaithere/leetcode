package DeleteAndEarn;

public class Solution {

    public static void main(String[] args) {
        deleteAndEarn(new int[]{2,2,3,3,3,4});
    }


    public static int deleteAndEarn(int[] nums) {
        if(nums.length == 1) return nums[0];
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        int[] numsMap = new int[max + 1];
        for (int i = 0; i < nums.length; i++) {
            numsMap[nums[i]] += nums[i];
        }
        int a = numsMap[0];
        int b = numsMap[1];

        for (int i = 2; i <= max; i++) {
            int temp = Math.max(a + numsMap[i], b);
            a = b;
            b = temp;
        }
        return b;
    }

}
