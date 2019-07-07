package com.frostmaster.leetcode.RemoveDuplicatesFromSortedArray;

public class Solution {

  public int removeDuplicates(int[] nums) {
    int result = 1;
    int dups = 0;

    if (nums.length == 0) return 0;

    if (nums.length == 1) return 1;

    int prev = nums[0];

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != prev) {
        result++;
        nums[i - dups] = nums[i];
      }
      else {
        dups++;
      }

      prev = nums[i];
    }

    return result;
  }

}
