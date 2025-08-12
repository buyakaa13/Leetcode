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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        else if(p == null || q == null) return false;
        else if(p.val != q.val) return false;
        Stack<TreeNode> stack1 = new Stack();
        Stack<TreeNode> stack2 = new Stack();
        stack1.push(p);
        stack2.push(q);
        while(!stack1.isEmpty() && !stack2.isEmpty()){
            int size1 = stack1.size();
            int size2 = stack2.size();
            if(size1 != size2) return false;
            while(size1 > 0){
                TreeNode current1 = stack1.pop();
                TreeNode current2 = stack2.pop();
                if(current1.left != null && current2.left != null){
                    if(current1.left.val != current2.left.val)
                    return false;
                    else{
                        stack1.push(current1.left);
                        stack2.push(current2.left);
                    }
                }
                else if((current1.left != null && current2.left == null)|| (current1.left == null && current2.left != null)) return false;
                
                if(current1.right != null && current2.right != null){
                    if(current1.right.val != current2.right.val)
                        return false;
                    else{
                        stack1.push(current1.right);
                        stack2.push(current2.right);
                    }
                }
                else if((current1.right != null && current2.right == null)|| (current1.right == null && current2.right != null)) return false;
                size1--;
            }
        }
        return true;
    }
}