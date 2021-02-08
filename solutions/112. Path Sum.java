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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
            return false;
        return check(root,targetSum);
    }
    
    public boolean check(TreeNode root, int targetSum){
        if(root==null&&targetSum==0)
            return true;
        if(root==null&&targetSum!=0)
            return false;
        if(root!=null&&root.left==null&&root.right==null&&(targetSum-root.val)==0)
            return true;
         if(root!=null&&root.left==null&&root.right==null&&(targetSum-root.val)!=0)
            return false;
        if(root.left==null&&root.right!=null)
            return check(root.right,targetSum-root.val);
        if(root.right==null&&root.left!=null)
            return check(root.left,targetSum-root.val);
        if(check(root.left,targetSum-root.val)||check(root.right,targetSum-root.val)){
            return true;
        }
        return false;
    }
}
