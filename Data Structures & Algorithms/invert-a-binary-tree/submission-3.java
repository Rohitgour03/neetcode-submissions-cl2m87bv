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

/* Iterative DFS Approach */ 

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        // Maintain your own stack instead of call stack
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        // Continue doing until the stack is empty
        while (!stack.isEmpty()) {

            // Take out the first element
            TreeNode node = stack.pop();

            // Swap the left and right node
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            // Push the left & right nodes if they are not null
            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }

        // return the current node
        return root;
    }
}
