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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if(root != null)
            dfs(root, root.val + "", result);
        return result;
    }

    public void dfs(TreeNode node, String path, List<String> paths){
        if(node.left == null && node.right == null) 
            paths.add(path);
        if(node.left != null)
            dfs(node.left, path + "->" + node.left.val, paths);
        if(node.right != null)
            dfs(node.right, path + "->" + node.right.val, paths);
    }
}