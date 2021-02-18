 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null)
            return false;
        Queue<TreeNode> qu=new LinkedList<>();
        qu.offer(root);
        while(!qu.isEmpty()){
            int size=qu.size();
            boolean foundx=false,foundy=false;
            while(size>0){
                TreeNode t=qu.poll();
                if(t.val==x)
                    foundx=true;
                if(t.val==y)
                    foundy=true;
                int left=0,right=0;
                if(t.left!=null){
                    left=t.left.val;
                    qu.offer(t.left);
                }
                if(t.right!=null){
                    right=t.right.val;
                    qu.offer(t.right);
                }
                if((left==x&&right==y)||(left==y&&right==x))
                    return false;
                if(foundx&&foundy)
                    return true;
                size--;
            }
        }
        return false;
    }
}
