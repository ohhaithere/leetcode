package AddBinary;

public class Solution {

  public String addBinary(String a, String b) {
    if (a.length() < b.length()) { String tmp = a; a = b; b = tmp; }
    StringBuilder sb = new StringBuilder();
    int rem = 0;
    for (int i = a.length() - 1, j = b.length() - 1; i >= 0; i--, j--) {
      int bitInA = a.charAt(i) - '0';
      int bitInB = (j >= 0) ? b.charAt(j) - '0' : 0;
      sb.append((bitInA + bitInB + rem) % 2);
      rem = (bitInA + bitInB + rem) / 2;
    }
    if (rem != 0) {
      sb.append(rem);
    }
    return sb.reverse().toString();
  }


}
