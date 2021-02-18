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
    int curr=0;
    public int sumRootToLeaf(TreeNode root) {
        if(root==null)
            return sum;
        curr=curr<<1 | root.val;
        if(root.left==null&&root.right==null){
            sum=sum+curr;
            curr=curr>>1;
            return sum;
        }
        sumRootToLeaf(root.left);
        sumRootToLeaf(root.right);
        curr=curr>>1;
        return sum;
    }
    
}
