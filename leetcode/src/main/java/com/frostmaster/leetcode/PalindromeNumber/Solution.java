package com.frostmaster.leetcode.PalindromeNumber;

public class Solution {

  public boolean isPalindrome(int x) {
    if(x < 0) {
      return false;
    }
    if(x < 10) {
      return true;
    }

    int palidrome = 0;
    int shredIt = x;

    while (shredIt != 0) {
      int tail = shredIt % 10;
      shredIt /= 10;
      palidrome = palidrome * 10 + tail;
    }

    return palidrome == x;
  }

}
