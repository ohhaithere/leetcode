package IntersectionOfTwoArraysII;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<nums1.length; i++){
            hm.put(nums1[i], hm.getOrDefault(nums1[i], 0) + 1);
        }
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0; i<nums2.length; i++){
            if(hm.containsKey(nums2[i]) && hm.get(nums2[i]) > 0){
                al.add(nums2[i]);
                hm.put(nums2[i], hm.get(nums2[i])-1);
            }
        }
        int [] arr = new int[al.size()];
        for(int i=0; i<al.size(); i++){
            arr[i] = al.get(i);
        }

        return arr;
    }

}
