package Permutations;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> dS = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        permutation(nums, dS, ans, freq);

        return ans;
    }

    private void permutation(int[] arr, List<Integer> dS, List<List<Integer>> ans, boolean[] freq)
    {
        if(dS.size() == arr.length)
        {
            ans.add(new ArrayList<>(dS));
            return;
        }

        for(int i = 0; i < arr.length; ++i)
        {
            if(!freq[i])
            {
                freq[i] = true;
                dS.add(arr[i]);
                permutation(arr, dS, ans, freq);
                dS.remove(dS.size() - 1);
                freq[i] = false;
            }
        }
    }

}
