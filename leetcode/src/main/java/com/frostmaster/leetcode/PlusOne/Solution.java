package com.frostmaster.leetcode.PlusOne;

public class Solution {

  public int[] plusOne(int[] digits) {
    if(digits[digits.length - 1] != 9) {
      digits[digits.length - 1] = digits[digits.length - 1] + 1;
      return digits;
    }
    int[] copy = new int[digits.length + 1];
    int sum = 1;
    boolean gogo = false;
    for(int i = digits.length - 1; i >= 0; i--) {
      copy[i + 1] = digits[i] + sum;
      digits[i] = copy[i + 1];
      if(copy[i + 1] != 10) {
        sum = 0;
        gogo = false;
      } else {
        copy[i + 1] = 0;
        digits[i] = 0;
        gogo = true;
      }
    }
    if(gogo) {
      copy[0] = 1;
    }

    if(copy[0] == 1) {
      return copy;
    } else {
      return digits;
    }
  }

}

