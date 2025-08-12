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
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root.left);
        queue.add(root.right);
        while(!queue.isEmpty()){
            TreeNode current1 = queue.poll();
            TreeNode current2 = queue.poll();
            if(current1 == null && current2 == null) continue;
            if(current1 == null || current2 == null || current1.val != current2.val) return false;
            queue.add(current1.left);
            queue.add(current2.right);
            queue.add(current1.right);
            queue.add(current2.left);
        }
        return true;
    }
}