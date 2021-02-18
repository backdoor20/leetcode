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
    int minimumDistance=Integer.MAX_VALUE;
    int lastValue=-1;
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return minimumDistance;
    }
    void inorder(TreeNode root){
        if(root==null)
            return;
        inorder(root.left);
        if(lastValue==-1)
            lastValue=root.val;
        else{
            int min=Math.abs(root.val-lastValue);
            lastValue=root.val;
            if(minimumDistance>min)
                minimumDistance=min;
        }
        inorder(root.right);
    }
}
