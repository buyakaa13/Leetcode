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
        return checkBalance(root)[0] == 1;
    }

    public int[] checkBalance(TreeNode root){
        if(root == null) return new int[]{1, 0};
        int[] left = checkBalance(root.left);
        int[] right = checkBalance(root.right);
        boolean balance = left[0] == 1 && right[0] == 1 && Math.abs(left[1]-right[1]) <= 1;
        return new int[]{balance ? 1 : 0, 1 + Math.max(left[1], right[1])};
    }
}