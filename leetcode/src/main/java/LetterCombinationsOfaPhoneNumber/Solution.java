package LetterCombinationsOfaPhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> letterCombinations(String digits) {
        String[] words = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String>ans = new ArrayList<>();
        letter(digits,"",ans,words);
        if(ans.size() == 1){
            ans = new ArrayList<>();
        }
        return ans;
    }
    public void letter(String digits,String ans,List<String>a,String[] words){
        if(digits.length() == 0){
            a.add(ans);
            return;
        }
        char ch = digits.charAt(0);
        int x = ch - '0';
        String word = words[x];
        for(int i=0; i<word.length(); i++){
            char ch1 = word.charAt(i);
            letter(digits.substring(1),ans+ch1,a,words);
        }
    }

}
