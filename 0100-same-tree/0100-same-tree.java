class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;   // both empty, same
        if (p == null || q == null) return false;  // one empty, not same
        if (p.val != q.val) return false;          // different values, not same

        return isSameTree(p.left, q.left) &&       // check left subtrees
               isSameTree(p.right, q.right);       // check right subtrees
    }
}