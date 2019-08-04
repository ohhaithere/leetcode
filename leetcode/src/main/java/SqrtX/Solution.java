package SqrtX;

public class Solution {

  public int mySqrt(int x) {
    if(x == 0) {
      return 0;
    }
    int left = 1;
    int right = x;

    while(left < right) {
      int mid = left + (right - left) / 2;

      if(mid == left) {
        return left;
      }

      if((long) mid * mid > x) {
        right = mid;
      } else {
        left = mid;
      }
    }
    return left;
  }

}
