/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

/* Recursive Approach */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;              // return null since nothing to do with null node.

        TreeNode leftSub = invertTree(root.left);   // handle left subtree
        TreeNode rightSub = invertTree(root.right); // handle right subtree
        root.left = rightSub;   // the prev right subtree is now placed at left of current node
        root.right = leftSub;   // the prev left subtree is now placed at right of current node
        return root;
    }
}
