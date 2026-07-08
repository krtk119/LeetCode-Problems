class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;   // both empty, symmetric
        if (left == null || right == null) return false;  // one empty, not symmetric
        if (left.val != right.val) return false;          // different values

        return isMirror(left.left, right.right) &&        // outer pair
               isMirror(left.right, right.left);          // inner pair
    }
}