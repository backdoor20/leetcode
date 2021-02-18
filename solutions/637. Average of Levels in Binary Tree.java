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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list=new ArrayList<>();
        if(root==null)
            return list;
        Queue<TreeNode> qu=new LinkedList<>();
        qu.offer(root);
        while(!qu.isEmpty()){
            int size=qu.size();
            long sum=0;
            int tempSize=size;
            while(size>0){
                TreeNode t=qu.poll();
                sum+=t.val;
                if(t.left!=null)
                    qu.offer(t.left);
                if(t.right!=null)
                    qu.offer(t.right);
                size--;
            }
            double f=(double)sum/tempSize;
            Double d=new Double(f);
            list.add(d);
        }
        return list;
    }
}
