class Solution {
    public int reverse(int x) {
        long reversed = 0;

        while (x != 0) {
            reversed = reversed * 10 + x % 10;   // pop last digit, push to reversed
            x /= 10;                               // remove last digit
        }

        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;                              // overflow, return 0
        }

        return (int) reversed;
    }
}