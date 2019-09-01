package UncommonSentence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {

  public String[] uncommonFromSentences(String A, String B) {
    Map<String, Integer> stuff = new HashMap();

    String[] resultA = A.split(" ");

    for (String word: resultA) {
      stuff.put(word, stuff.getOrDefault(word, 0) + 1);
    }

    String[] resultB = B.split(" ");

    for (String word: resultB) {
      stuff.put(word, stuff.getOrDefault(word, 0) + 1);
    }

    List<String> result = new ArrayList<>();

    for (String word: stuff.keySet()) {
      {
        if (stuff.get(word) == 1)
          result.add(word);
      }
    }

    return result.toArray(new String[result.size()]);
  }

}
