package IsValidPalidrome;

public class Solution {

  public boolean isPalindrome(String s) {
    s = s.replaceAll("[^\\w]","").toLowerCase();
    if(s.equals(new StringBuilder(s).reverse().toString())) {
      return true;
    } else {
      return false;
    }
  }

}
