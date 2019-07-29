package com.frostmaster.leetcode.MaximumSubArray;

public class Solution {

  public int maxSubArray(int[] nums) {
   int max = nums[0];
   int sum = nums[0];

   for(int i = 1; i < nums.length; i++) {
     if(nums[i] + sum > nums[i]) {
       sum += nums[i];
     } else {
       sum = nums[i];
     }

     if(max < sum) {
       max = sum;
     }
   }
   return max;
  }

}
