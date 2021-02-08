/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
       if(root==null)
           return true;
        int left=isHeight(root.left);
        int right=isHeight(root.right);
        if(Math.abs(left-right)>1)
            return false;
        if(isBalanced(root.left)&&isBalanced(root.right))
            return true;
        return false;
        
    }
    
    public int isHeight(TreeNode root){
        if(root==null)
            return 0;
        return 1+Math.max(isHeight(root.left), isHeight(root.right));        
    }
}
