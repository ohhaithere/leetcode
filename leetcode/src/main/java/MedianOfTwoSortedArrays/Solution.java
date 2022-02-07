package MedianOfTwoSortedArrays;

import com.sun.tools.javac.util.ArrayUtils;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int i = 0, j = 0;

        while(i + j < nums.length){

            if(i >= nums1.length) nums[i + j] = nums2[j++];
            else if(j >= nums2.length) nums[i + j] = nums1[i++];
            else if(nums1[i] < nums2[j]) nums[i + j] = nums1[i++];
            else nums[i + j] = nums2[j++];

        }
        if(nums.length % 2 == 0) return ((float) (nums[nums.length / 2] + nums[nums.length / 2 - 1])) / 2;
        return nums[(nums.length - 1) / 2];

    }
}
