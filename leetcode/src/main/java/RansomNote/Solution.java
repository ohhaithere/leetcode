package RansomNote;

import java.util.HashMap;

public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> ransomCount = new HashMap<>();
        HashMap<Character, Integer> magazineCount = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            ransomCount.put(c, ransomCount.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            magazineCount.put(c, magazineCount.getOrDefault(c, 0) + 1);
        }

        for (Character c : ransomCount.keySet()) {
            if (magazineCount.get(c) == null) {
                return false;
            }
            if (ransomCount.get(c) > magazineCount.get(c)) {
                return false;
            }
        }

        return true;
    }


}
