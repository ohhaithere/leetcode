package Combinations;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new LinkedList<>();
        LinkedList<Integer> track = new LinkedList<>();

        backtrack(n, k, 1, track, result); // [1, n];

        return result;

    }

    private void backtrack(int n, int target, int start, LinkedList<Integer> track, List<List<Integer>> result) {

        if (track.size() == target) {
            result.add(new LinkedList<>(track));
            return;
        }

        for (int i = start; i <= n; i++) {
            track.add(i);
            backtrack(n, target, i + 1, track, result);
            track.removeLast();
        }
    }

}
