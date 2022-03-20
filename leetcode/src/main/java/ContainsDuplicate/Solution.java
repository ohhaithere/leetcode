package ContainsDuplicate;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> dublicates = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!dublicates.containsKey(nums[i])) {
                dublicates.put(nums[i], nums[i]);
            } else {
                return true;
            }

        }
        return false;
    }

}
