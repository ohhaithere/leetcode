package MergeSortedArray;

import java.util.Arrays;

public class Solution {

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    for(int digit : nums2){
      nums1[m] =  digit;
      m++;
    }

    Arrays.sort(nums1);
  }

}
