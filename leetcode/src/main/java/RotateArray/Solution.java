package RotateArray;

import java.util.Arrays;

public class Solution {

  public static void rotate(int[] nums, int k) {
    if(k == 0) {
      return;
    }
    if(nums.length <= 1) {
      return;
    }
    if(nums.length == k) {
      return;
    }

    int[] newArr = new int[nums.length];


    for (int i = 0; i < nums.length; i++) {
      newArr[(i + k) % nums.length] = nums[i];
    }
    for (int i = 0; i < nums.length; i++) {
      nums[i] = newArr[i];
    }
  }

  public static void main(String args[]) {
    int[] arr = new int[2];
    arr[0] = 1;
    arr[1] = 2;

    rotate(arr, 1);
  }

}
