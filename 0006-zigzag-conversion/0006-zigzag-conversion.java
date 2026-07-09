class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) return s;  // no zigzag needed

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);                // add char to current row

            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;                // flip direction at top and bottom
            }

            currentRow += goingDown ? 1 : -1;         // move up or down
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);                        // concatenate all rows
        }

        return result.toString();
    }
}