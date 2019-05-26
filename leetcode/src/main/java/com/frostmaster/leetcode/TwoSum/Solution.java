package com.frostmaster.leetcode.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> stuff = new HashMap<Integer, Integer>();

    for(int i = 0; i < nums.length; i++) {
      if(stuff.get(nums[i]) != null) {
        return new int[]{stuff.get(nums[i]), i};
      } else {
        stuff.put(target - nums[i], i);
      }
    }

    return new int[]{};
  }

}
