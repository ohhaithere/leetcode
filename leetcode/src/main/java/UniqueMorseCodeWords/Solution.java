package UniqueMorseCodeWords;

import java.util.HashSet;
import java.util.Set;

public class Solution {

  public int uniqueMorseRepresentations(String[] words) {
    String[] codes = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
        "....","..",".---","-.-",".-..","--","-.",
        "---",".--.","--.-",".-.","...","-","..-",
        "...-",".--","-..-","-.--","--.."};

    Set<String> sos = new HashSet();
    for (String word: words) {
      StringBuilder code = new StringBuilder();
      char[] characters = word.toCharArray();
      for (char c: characters) {
        code.append(codes[c - 'a']);
      }
      sos.add(code.toString());
    }

    return sos.size();
  }

}
