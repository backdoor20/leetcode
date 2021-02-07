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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> li=new ArrayList();
        Queue<TreeNode> qu=new LinkedList<>();
        Stack<List<Integer>> stack=new Stack<>();
        if(root==null){
            return list;
        }
        qu.offer(root);
        while(!qu.isEmpty()){
            int size=qu.size();
            li=new ArrayList();
            while(size>0){
                TreeNode current=qu.poll();
                li.add(current.val);
                if(current.left!=null)
                    qu.offer(current.left);
                if(current.right!=null)
                    qu.offer(current.right);
                size--;
            }
            stack.push(li);
        }
        while(!stack.isEmpty())
            list.add(stack.pop());
        return list;
    }
}
