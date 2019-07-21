package com.frostmaster.leetcode.ImplementStrStr;

public class Solution {

  public int strStr(String haystack, String needle) {
    if(needle.isEmpty()) {
      return 0;
    }
    if(haystack.isEmpty()) {
      return -1;
    }

    for(int i = 0; i <= haystack.length() - needle.length(); i++) {
      if (needle.equals(haystack.substring(i, i + needle.length()))) {
        return i;
      }
    }

    return -1;
  }

}
