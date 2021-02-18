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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null)
            return list;
        Queue<TreeNode> qu=new LinkedList<>();
        qu.offer(root);
        while(!qu.isEmpty()){
            int size=qu.size();
            List<Integer> tempList=new ArrayList<>();
            while(size>0){
                TreeNode t=qu.poll();
                tempList.add(t.val);
                size--;
                if(t.left!=null)
                    qu.offer(t.left);
                if(t.right!=null)
                    qu.offer(t.right);
            }
            list.add(tempList);
        }
        return list;
    }
}
