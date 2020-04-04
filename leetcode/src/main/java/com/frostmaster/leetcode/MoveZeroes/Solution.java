package com.frostmaster.leetcode.MoveZeroes;

public class Solution {

  public static void main(String[] args) {
    moveZeroes(new int[]{0,1,1,2,0,0,3,4});
  }

  public static void moveZeroes(int[] nums) {
    int counter = 0;
    for (int i = 0; i<nums.length; i++){
      if (nums[i] != 0){
        nums[counter] = nums[i];
        counter++;
      }
    }
    for (int i = counter; i<nums.length; i++){
      nums[i] = 0;
    }
  }

}
