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
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        helper(root,false);
        return sum;
    }
    public void helper(TreeNode root,boolean left){
        if(root==null)
            return;
        if(left&&root.left==null&&root.right==null)
            sum=sum+root.val;
        helper(root.left,true);
        helper(root.right,false);
    }
}
