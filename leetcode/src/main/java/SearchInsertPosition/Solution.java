package SearchInsertPosition;

public class Solution {

    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }

        if (nums.length == 1) {
            if (nums[0] == target)
                return 0;
        }

        int pivot = nums.length / 2;

        if (nums[pivot] == target)
            return pivot;

        if (nums[pivot] > target) {
            for (int i = pivot; i >= 0; i--) {
                if ((i == 0) && nums[i] > target)
                    return 0;
                if (i >= 1) {
                    if ((nums[i] > target) && (nums[i - 1] < target))
                        return i;
                }
                if (nums[i] == target)
                    return i;
            }
        } else {
            for (int i = pivot; i < nums.length; i++) {
                if ((i == nums.length-1) && nums[i] < target)
                    return i+1;
                if (i < nums.length - 1) {
                    if ((nums[i] < target) && (nums[i + 1] > target))
                        return i+1;
                }
                if (nums[i] == target)
                    return i;
            }
        }

        return -1;
    }
}
