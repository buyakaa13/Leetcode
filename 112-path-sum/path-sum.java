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
        Stack<TreeNode> nodeStack = new Stack();
        Stack<Integer> sumStack = new Stack();
        nodeStack.push(root);
        sumStack.push(targetSum - root.val);
        while(!nodeStack.isEmpty()){
            TreeNode currentNode = nodeStack.pop();
            int currentSum = sumStack.pop();
            if(currentSum == 0 && currentNode.left == null && currentNode.right == null) return true;
            if(currentNode.left != null){
                nodeStack.push(currentNode.left);
                sumStack.push(currentSum - currentNode.left.val);
            }
            if(currentNode.right != null){
                nodeStack.push(currentNode.right);
                sumStack.push(currentSum - currentNode.right.val);
            }
        }
        return false;
    }
}