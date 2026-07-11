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

    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    private boolean helper(TreeNode node, TreeNode minNode, TreeNode maxNode) {

        if (node == null) {
            return true;
        }

        if (minNode != null && node.val <= minNode.val) {
            return false;
        }

        if (maxNode != null && node.val >= maxNode.val) {
            return false;
        }

        return helper(node.left, minNode, node)
                && helper(node.right, node, maxNode);
    }
}