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
    List<Integer> list1=new ArrayList<>();
    List<Integer> list2=new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        inorder(root1,list1);
        inorder(root2,list2);
        if(list1.size()!=list2.size())
            return false;
        int size=list1.size();
        for(int i=0;i<size;i++){
            if(list1.get(i)!=list2.get(i))
                return false;
        }
        return true;
    }
    void inorder(TreeNode root,List<Integer> list){
        if(root==null)
            return;
        inorder(root.left,list);
        if(root.left==null&&root.right==null)
            list.add(root.val);
        inorder(root.right,list);
    }
}
