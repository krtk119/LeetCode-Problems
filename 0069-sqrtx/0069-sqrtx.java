class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;                       // 0 and 1 edge cases

        int left = 1;
        int right = x / 2;                         // sqrt never exceeds x/2

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if ((long) mid * mid == x) {
                return mid;                         // perfect square
            } else if ((long) mid * mid < x) {
                left = mid + 1;                     // too small, go right
            } else {
                right = mid - 1;                    // too big, go left
            }
        }

        return right;                               // floor of sqrt
    }
}