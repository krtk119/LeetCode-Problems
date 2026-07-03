class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;                  // no carry, just increment and done
                return digits;
            }
            digits[i] = 0;                    // digit is 9, becomes 0 and carry over
        }

        int[] result = new int[digits.length + 1];  // all 9s case e.g. [9,9,9]
        result[0] = 1;                               // [1,0,0,0]
        return result;
    }
}