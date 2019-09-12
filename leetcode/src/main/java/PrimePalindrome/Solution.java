package PrimePalindrome;

public class Solution {

  public int primePalindrome(int N) {
    for (int i = 1; i <= 5; ++i) {
      for (int root = (int) Math.pow(10, i - 1); root < (int) Math.pow(10, i); ++root) {
        StringBuilder sb = new StringBuilder(Integer.toString(root));
        for (int k = i - 2; k >= 0; --k) {
          sb.append(sb.charAt(k));
        }

        int x = Integer.valueOf(sb.toString());
        if (x >= N && isPrime(x)) {
          return x;
        }
      }

      for (int root = (int)Math.pow(10, i - 1); root < (int)Math.pow(10, i); ++root) {
        StringBuilder sb = new StringBuilder(Integer.toString(root));
        for (int k = i-1; k >= 0; --k) {
          sb.append(sb.charAt(k));
        }
        int x = Integer.valueOf(sb.toString());
        if (x >= N && isPrime(x)) {
          return x;
        }
      }
    }

    throw null;
  }

  public boolean isPrime(int N) {
    if (N < 2) {
      return false;
    }

    int R = (int) Math.sqrt(N);
    for (int d = 2; d <= R; ++d) {
      if (N % d == 0)
        return false;
    }
    return true;
  }

}
