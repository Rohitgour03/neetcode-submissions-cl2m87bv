/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}Custom code
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        /* root is either p or q */
        if (root.val == p.val || root.val == q.val) {
            return root;
        } else {
            /* root is not p or q */

            /* current root can be ancestor to both p & q */
            if ((p.val < root.val && root.val < q.val) || (q.val < root.val && root.val < p.val)) {
                return root;
            } 
            /* both p and q lies in either left or right of root */
            else if (p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left, p, q);
            else if (p.val > root.val && q.val > root.val) return lowestCommonAncestor(root.right, p, q);
        }

        return null;
    }
}
