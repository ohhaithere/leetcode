package SingleNumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {

  public int singleNumber(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    Set<Integer> set = new HashSet<>();

    for (int num : nums) {
      if (!set.add(num)) {
        set.remove(num);
      }
    }

    return set.iterator().next();
  }

}
