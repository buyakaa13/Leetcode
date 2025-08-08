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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        Stack<TreeNode> stack = new Stack();
        Stack<Integer> sumTotal = new Stack();
        stack.push(root);
        sumTotal.push(targetSum-root.val);
        while(!stack.isEmpty()){
            TreeNode current = stack.pop();
            int currentSum = sumTotal.pop();
            if(currentSum == 0 && current.left == null && current.right == null) return true;
            if(current.left != null){
                stack.push(current.left);
                sumTotal.push(currentSum-current.left.val);
            }
            if(current.right != null){
                stack.push(current.right);
                sumTotal.push(currentSum - current.right.val);
            }
        }
        return false;
    }
}