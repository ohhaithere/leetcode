package MoveZeroes;

import sun.lwawt.macosx.CSystemTray;

public class Solution {

    public static void main(String args[]) {
        moveZeroes(new int[]{0,1,0});
    }

    public static void moveZeroes(int[] nums) {
        int j =0;

        for(int i= 0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[j++]=nums[i];
            }
        }
        while(j<nums.length){
            nums[j++]=0;
        }
    }

}
