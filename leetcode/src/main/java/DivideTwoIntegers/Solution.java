package DivideTwoIntegers;

public class Solution {

    public static int divide(int dividend, int divisor) {
        if (dividend == 0)
            return 0;
        int result = -1;
        boolean shouldBeNegative = false;
        boolean bothNegative = false;

        if (dividend < 0 && divisor < 0) {
            bothNegative = true;
        }

        if (dividend == Integer.MIN_VALUE && divisor < 0) {
            dividend = Integer.MAX_VALUE;
        }

        if (divisor < 0) {
            divisor = divisor * (-1);
            shouldBeNegative = true;
        }


        if (dividend < 0) {
            dividend = dividend * (-1);
            shouldBeNegative = true;
        }

        if (bothNegative && (dividend == divisor)) {
            return result * (-1);
        }

        if (dividend == divisor)
            return shouldBeNegative ? -1 : 1;

        if (divisor == 1) {
            if (bothNegative) {
                return dividend;
            } else {
                if (shouldBeNegative) {
                    return dividend * (-1);
                } else {
                    return dividend;
                }
            }
        }

        while (dividend > 0) {
            dividend = dividend - divisor;
            result++;
        }

        if (bothNegative) {
            return result;
        }

        return shouldBeNegative ? (result * (-1)) : result;
    }

    public static void main(String args[]) {
        divide(-2147483648, 2);
    }

}
