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
    public boolean isBalanced(TreeNode root) {
        return checkBalance(root) != -1;
    }

    public int checkBalance(TreeNode node){
        if (node == null) return 0;  // Base case: empty tree has height 0

        // Recursively get the height of the left subtree
        int leftHeight = checkBalance(node.left);
        if (leftHeight == -1) return -1;  // If the left subtree is unbalanced, return -1

        // Recursively get the height of the right subtree
        int rightHeight = checkBalance(node.right);
        if (rightHeight == -1) return -1;  // If the right subtree is unbalanced, return -1

        // If the height difference between left and right subtrees is more than 1, return -1
        if (Math.abs(leftHeight - rightHeight) > 1) return -1;

        // Return the height of the current node
        return Math.max(leftHeight, rightHeight) + 1;
    }
}