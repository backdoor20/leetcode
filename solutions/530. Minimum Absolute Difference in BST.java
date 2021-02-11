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
    int minAbsolute=Integer.MAX_VALUE;
    int lastnumber=-1;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minAbsolute;
    }
    public void inorder(TreeNode root){
        if(root==null)
            return;
        inorder(root.left);
        processNow(root.val);
        inorder(root.right);
    }
    
    public void processNow(int value){
        if(lastnumber==-1){
            lastnumber=value;
            return;
        }
        int min=Math.abs(value-lastnumber);
        if(min<minAbsolute){
            minAbsolute=min;
        }
        lastnumber=value;
    }
}
