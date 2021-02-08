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
    public TreeNode sortedArrayToBST(int[] nums) {
        return BST(nums,0,nums.length-1);
    }
    
    public TreeNode BST(int[] nums, int lower,int higher){
        TreeNode node=null;
        if(lower<=higher){
            int mid=(lower+higher)/2;
            node=new TreeNode(nums[mid]);
            node.left=BST(nums,lower,mid-1);
            node.right=BST(nums,mid+1,higher);
        }
        return node;
    }
}
