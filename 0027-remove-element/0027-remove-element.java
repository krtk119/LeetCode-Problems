class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;                           // pointer for next valid position

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {            // if not the value to remove
                nums[k] = nums[i];           // copy it to position k
                k++;                         // move k forward
            }
        }

        return k;      
    }
}