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
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode rightSide = null;
            int queueLen = queue.size();
            for(int i=0; i<queueLen; i++){
                TreeNode currentNode = queue.poll();
                if(currentNode != null){
                    rightSide = currentNode;
                    queue.offer(currentNode.left);
                    queue.offer(currentNode.right);
                }
            }
            if(rightSide != null)
                result.add(rightSide.val);
        }
        return result;
    }
}