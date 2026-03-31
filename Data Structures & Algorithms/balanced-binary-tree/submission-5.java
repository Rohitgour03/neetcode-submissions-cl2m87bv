/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) {
 *         this.val = val;
 *     }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int left = treeHeight(root.left);
        int right = treeHeight(root.right);
        return Math.abs(right - left) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int treeHeight(TreeNode node) {
        if (node == null) return 0;
        int leftHeight = treeHeight(node.left);
        int rightHeight = treeHeight(node.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }
}