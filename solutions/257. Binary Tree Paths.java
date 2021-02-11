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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        StringBuilder st=new StringBuilder();
        pathOfBinaryTree(root,st,list);
        return list;
    }
    public void pathOfBinaryTree(TreeNode root,StringBuilder str,List<String> list){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            str.append(root.val);
            list.add(str.toString());
        }else{
            StringBuilder left=new StringBuilder(str);
            StringBuilder right=new StringBuilder(str);
            left.append(root.val).append("->");
            right.append(root.val).append("->");
            pathOfBinaryTree(root.left,left,list);
            pathOfBinaryTree(root.right,right,list);
        }
    }
}
