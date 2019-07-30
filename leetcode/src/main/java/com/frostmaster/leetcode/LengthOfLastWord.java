package com.frostmaster.leetcode;

public class LengthOfLastWord {

  public int lengthOfLastWord(String s) {
    if(s.length() == 0) {
      return 0;
    }

    String[] words = s.split(" ");

    if(words.length == 0) {
      return 0;
    }

    return words[words.length-1].length();
  }

}
