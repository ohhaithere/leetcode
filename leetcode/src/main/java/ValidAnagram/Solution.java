package ValidAnagram;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    public static boolean isAnagram(String s, String t) {
        char[] sarray = s.toCharArray();
        char[] tarray = t.toCharArray();
        Arrays.sort(sarray);
        Arrays.sort(tarray);
        s = new String(sarray);
        t = new String(tarray);

        return s.equals(t);
    }

}
