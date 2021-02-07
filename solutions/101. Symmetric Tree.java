 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        ArrayList<TreeNode> li=new ArrayList<>();
        li.add(root);
        while(li.size()>0){
            System.out.println();
            boolean find=check(li);
            if(find!=true){
                return false;
            }
            int i=0;
            int size=li.size();
            ArrayList<TreeNode> li_new=new ArrayList<>();
            while(i<size){
                if(li.get(i)!=null){
                    if(li.get(i).left!=null)
                        li_new.add(li.get(i).left);
                    else
                        li_new.add(null);
                    
                    if(li.get(i).right!=null)
                        li_new.add(li.get(i).right);
                    else
                        li_new.add(null);
                   
                }
                 i++;
            }
            li=li_new;
        }
        return true;
