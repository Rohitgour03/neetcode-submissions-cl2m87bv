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

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        createRightiii(root, list);
        return list;
    }

    public List<Integer> createRightiii(TreeNode root, List<Integer> list) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return new ArrayList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int lvlSize = queue.size();
            TreeNode rightMostNode = null;
            for (int i = 0; i < lvlSize; i++) {
                TreeNode node = queue.poll();
                if (node != null) rightMostNode = node;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            if (rightMostNode != null) list.add(rightMostNode.val);
        }
        return list;
    }
}
