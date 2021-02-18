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
    int prev1=-1,prev2=-1;
    public int findSecondMinimumValue(TreeNode root) {
        inorder(root);
        return prev2;
    }
    void inorder(TreeNode root){
        if(root==null)
            return;
        inorder(root.left);
        if(prev1==-1){
            prev1=root.val;
        }else if(prev1!=root.val){
            if(root.val<prev1){
                prev2=prev1;
                prev1=root.val;
            }else{
                if(prev2==-1)
                    prev2=root.val;
                if(root.val<prev2)
                    prev2=root.val;
            }
        }
        inorder(root.right);
    }
}
