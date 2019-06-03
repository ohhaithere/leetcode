package com.frostmaster.leetcode.LongestCommonPrefix;

import java.util.Arrays;

public class Solution {

  public String longestCommonPrefix(String[] strs) {
    if(strs.length==0) {
      return "";
    }

    Arrays.sort(strs);

    String shortest=strs[0];
    String longest=strs[strs.length-1];

    int overallCharacters = shortest.length() > longest.length() ? longest.length() : shortest.length();
    int commonCharacters = 0;
    for(int i = 0; i < overallCharacters; i++){
      if(shortest.charAt(i) != longest.charAt(i)){
        break;
      }
      commonCharacters++;
    }
    return shortest.substring(0, commonCharacters);
  }

}
