package com.frostmaster.leetcode.RemoveElement;

public class Solution {

  public int removeElement(int[] nums, int val) {
    int numToMove = 0;
    for (int i = 0; i < nums.length; i++) {
      if(nums[i] == val) {
        numToMove++;
      } else {
        nums[i - numToMove] = nums[i];
      }
    }

    return nums.length - numToMove;
  }

}
