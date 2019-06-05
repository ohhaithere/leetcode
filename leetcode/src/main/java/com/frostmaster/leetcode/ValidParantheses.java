package com.frostmaster.leetcode;

import java.util.HashMap;
import java.util.Stack;

public class ValidParantheses {

  public boolean isValid(String s) {
    if (s == ""){
      return true;
    }
    if (s.length()%2 != 0){
      return false;
    }

    HashMap<Character, Character> parantheses = new HashMap<Character, Character>();
    parantheses.put('(', ')');
    parantheses.put('{', '}');
    parantheses.put('[', ']');

    Stack<Character> stack  = new Stack<Character>();

    for(int i = 0; i < s.length(); i ++){
      if (parantheses.containsKey(s.charAt(i))){
        stack.push(s.charAt(i));
      }else{
        if (!stack.empty()){
          if(parantheses.containsKey(stack.peek())){
            if(parantheses.get(stack.peek()) == s.charAt(i)){
              stack.pop();
            }else{
              stack.push(s.charAt(i));
            }
          }
        }
      }
    }
    return stack.empty();

  }

}
