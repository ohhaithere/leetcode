package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Character> map = new HashMap<>();
        Integer max = 0;
        Integer sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                i = i - (sum - 1);
                sum = 0;
                map.clear();
            }
                map.put(s.charAt(i), s.charAt(i));
                sum++;

            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

}
