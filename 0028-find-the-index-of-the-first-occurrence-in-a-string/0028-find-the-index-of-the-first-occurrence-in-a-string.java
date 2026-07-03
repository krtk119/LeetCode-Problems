class Solution {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();

        for (int i = 0; i <= h - n; i++) {          // no point going further than h-n
            if (haystack.substring(i, i + n).equals(needle)) {
                return i;                             // found it
            }
        }

        return -1;                                    // not found
    }
}