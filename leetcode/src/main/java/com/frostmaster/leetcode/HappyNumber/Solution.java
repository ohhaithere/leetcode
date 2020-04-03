package com.frostmaster.leetcode.HappyNumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {

  public static void main(String[] args) {
    isHappy(2);
  }

  public static boolean isHappy(int n) {
    Set<Integer> alreadySeen = new HashSet<>();
    int sum = 0;
    while(sum != 1) {
      sum = 0;
      while (n > 0) {
        sum += (int) Math.pow(n % 10, 2);
        n = n / 10;
      }
      if(alreadySeen.contains(sum)) {
        return false;
      }
      alreadySeen.add(sum);
      n = sum;
    }
    return true;
  }



}
