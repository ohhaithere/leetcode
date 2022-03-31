package PowerOfTwo;

public class Solution {

    public boolean isPowerOfTwo(int n) {
            if (n == 1) return true;
            if (n <= 0) return false;
            int j = n;
            int count = 0;

            while (j != 0) {
                count += j & 1;
                j >>>= 1;
            }
            if (count == 1) {
                return true;
            }

            return false;

    }

}
