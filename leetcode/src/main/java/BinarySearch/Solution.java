package BinarySearch;

public class Solution {

    public static void main(String[] args) {
        search(new int[]{2,5}, 2);
    }

    public static int search(int[] nums, int target) {
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

        if (nums[pivot]  > target) {
            for (int i = pivot; i >= 0; i--) {
                if (nums[i] == target)
                    return i;
            }
        } else {
            for (int i = pivot; i < nums.length; i++) {
                if (nums[i] == target)
                    return i;
            }
        }

        return -1;
    }

}
