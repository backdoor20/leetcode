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
    public String tree2str(TreeNode t) {
        String s=preorder(t);
        return s;
    }
    public String preorder(TreeNode t){
        if(t==null)
            return "";
        int s=t.val;
        String left=preorder(t.left);
        String right=preorder(t.right);
        if(t.right==null&&t.left==null){
            return s+"";
        }
        else if(t.right!=null)
        return s+"("+left+")"+"("+right+")";
        else
        return s+"("+left+")";
    }
}
