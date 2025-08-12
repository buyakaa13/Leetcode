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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return false;
        Stack<TreeNode> stack1 = new Stack();
        Stack<TreeNode> stack2 = new Stack();
        stack1.push(root.left);
        stack2.push(root.right);
        while(!stack1.isEmpty() && !stack2.isEmpty()){
            TreeNode current1 = stack1.pop();
            TreeNode current2 = stack2.pop();
            if(current1 == null && current2 == null) continue;
            if(current1 == null || current2 == null || current1.val != current2.val) return false;
            stack1.push(current1.left);
            stack1.push(current1.right);

            stack2.push(current2.right);
            stack2.push(current2.left);
        }
        return stack1.isEmpty() && stack2.isEmpty();
    }
}