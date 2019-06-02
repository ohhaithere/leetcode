package com.frostmaster.leetcode.RomanToInteger;

public class Solution {

  public int romanToInt(String s) {

    int sum=0;
    char[] ch = s.toCharArray();

    for(int i=0;i<ch.length;i++) {
      if (ch[i] == 'M') sum += 1000;
      else if(ch[i] =='C'  &&  i<ch.length-1  && ch[i+1] =='D') {
        sum+=400;i++;
      }else if(ch[i] =='C'  &&  i<ch.length-1  && ch[i+1] =='M') {
        sum+=900;i++;
      }else if(ch[i] =='X'  &&  i<ch.length-1  && ch[i+1] =='L') {
        sum+=40;i++;
      }else if(ch[i] =='X'  &&  i<ch.length-1  && ch[i+1] =='C') {
        sum+=90;i++;
      }else if(ch[i] =='I'  &&  i<ch.length-1  && ch[i+1] =='V') {
        sum+=4;i++;
      }else if(ch[i] =='I'  &&  i<ch.length-1  && ch[i+1] =='X') {
        sum+=9;i++;
      } else if(ch[i] == 'D') {
        sum+=500;
      } else if(ch[i] == 'C') {
        sum+=100;
      } else if(ch[i] == 'L') {
        sum+=50;
      } else if(ch[i] == 'X') {
        sum+=10;
      } else if(ch[i] == 'V') {
        sum+=5;
      } else if(ch[i] == 'I') {
        sum+=1;
      }
    }

    return sum;
  }

}
