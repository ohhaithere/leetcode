package LetterCasePermutation;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> letterCasePermutation(String s) {

        List<String> ans=new ArrayList<>();
        findPermutation(s.toCharArray(),0,ans);
        return ans;
    }

    public void findPermutation(char[] arr, int index, List<String> ans){
        if(index==arr.length){
            ans.add(new String(arr));
            return;
        }
        if(Character.isDigit(arr[index])){
            findPermutation(arr,index+1,ans);
        }
        else{
            arr[index]=Character.toLowerCase(arr[index]);
            findPermutation(arr,index+1,ans);

            arr[index]=Character.toUpperCase(arr[index]);
            findPermutation(arr,index+1,ans);
        }
    }

}
