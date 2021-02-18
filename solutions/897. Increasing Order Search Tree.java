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
    TreeNode curr=null;
    public TreeNode increasingBST(TreeNode root) {
        if(root==null)
            return root;
       TreeNode res=new TreeNode(0);
        curr=res;
       getBST(root);
        return res.right;        
    }
    
    public void getBST(TreeNode root){
        if(root==null)
            return ;
        getBST(root.left);
        root.left=null;
        curr.right=root;
        curr=root;
        getBST(root.right);
    }
}
