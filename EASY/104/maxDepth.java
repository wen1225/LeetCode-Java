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
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        else {
            int leftDepth = 1;
            int rightDepth = 1;
            if (root.left != null) {
                leftDepth += maxDepth(root.left) + 1;
            }
            if (root.right != null) {
                rightDepth += maxDepth(root.right);
            }
            return (leftDepth > rightDepth) ? leftDepth : rightDepth;
        }
    }
}
