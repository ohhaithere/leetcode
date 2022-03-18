package CombinationSum;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<List<Integer>> r = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> s = new ArrayList<>();
        processNode(candidates, s, 0, 0, target);
        return r;
    }

    void processNode(int[] c, List<Integer> s, int total, int i, int target) {
        if (i+1 < c.length) {
            processNode(c, s, total, i+1, target);
        }

        s.add(c[i]);
        total += c[i];

        if (total == target) {
            r.add(new ArrayList<>(s));
        }
        else if (total < target) {
            processNode(c, s, total, i, target);
        }

        s.remove(s.size() - 1);
    }

}
