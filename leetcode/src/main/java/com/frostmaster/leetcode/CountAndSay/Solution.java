package com.frostmaster.leetcode.CountAndSay;

public class Solution {

  public String countAndSay(int n) {
    if(n == 1) {
      return "1";
    }
    if(n == 2) {
      return "11";
    }

    String result = "11";

    for(int i = 3; i <= n; i++) {
      result += "$";
      int count = 1;
      String temp = "";
      char[] arr = result.toCharArray();

      for(int j = 1; j < result.length(); j++) {
        if(arr[j] != arr[j - 1]) {
          temp += count + 0;
          temp += arr[j - 1];
          count = 1;
        } else {
          count++;
        }
      }

      result = temp;
    }

    return result;
  }

}
