class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    private void traverse(TreeNode node, List<Integer> result) {
        if (node == null) return;             // base case

        traverse(node.left, result);          // go left
        result.add(node.val);                 // visit node
        traverse(node.right, result);         // go right
    }
}