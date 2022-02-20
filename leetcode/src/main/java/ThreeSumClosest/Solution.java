package ThreeSumClosest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[nums.length-1];

        for(int i = 0; i < nums.length-2; i++) {
            int j = i + 1, k = nums.length-1;
            int sumTemp= 0 ;

            while(j < k) {
                sumTemp = nums[i] + nums[j] + nums[k];
                if (sumTemp > target) {
                    k--;
                } else {
                    j++;
                }


                if (Math.abs(sum - target) > Math.abs(sumTemp - target)) {
                    sum = sumTemp;
                }
            }
        }
        return sum;
    }

    public static void main(String args[]) {

        System.out.println(threeSumClosest(new int[]{0,2,1,-3} , -100));
    }

}
