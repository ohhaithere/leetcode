package ClimbingStairs;

public class Solution {

  public int climbStairs(int n) {
    if(n == 1) {
      return 1;
    }

    int first = 0;
    int second = 1;
    int temp = second;

    for(int i = 2; i <= n; i++) {
      temp = first + second;
      first = second;
      second = temp;
    }

    return temp + first;
  }

}
