package com.frostmaster.leetcode.ReverseInteger;

public class Solution {

  public int reverse(int x) {
    int result = 0;

    while (x != 0) {
      int tail = x % 10;
      if(x > 0 && (Integer.MAX_VALUE - tail) / 10 < result)
        return 0;
      if(x < 0 && (Integer.MIN_VALUE - tail) / 10 > result)
        return 0;
      x /= 10;
      result = result * 10 + tail;
    }

    return result;
  }

}
