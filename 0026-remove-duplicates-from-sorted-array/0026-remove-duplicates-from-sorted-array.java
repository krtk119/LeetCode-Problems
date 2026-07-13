class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;                                    // start from 1, first element always unique

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {             // new unique element found
                nums[k] = nums[i];                    // place it at position k
                k++;                                  // move k forward
            }
        }

        return k;
    }
}