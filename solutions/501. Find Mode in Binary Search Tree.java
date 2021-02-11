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
    int maxCount=-1;
    int lastValue=Integer.MIN_VALUE;
    int currentCount=0;
    List<Integer> list=new ArrayList<>();
    public int[] findMode(TreeNode root) {
        inorder(root);
        int[] arr=new int[list.size()];
        int i=0;
        for(Integer a: list)
        arr[i++]=a;
        return arr;
    }
    
    public void inorder(TreeNode root){
        if(root==null)
            return;
        inorder(root.left);
        processCurrent(root.val);
        inorder(root.right);
    }
    public void processCurrent(int value){
        if(lastValue!=value){
            lastValue=value;
            currentCount=0;
        }
        currentCount++;
        if(currentCount>maxCount){
            list=new ArrayList();
            list.add(value);
            maxCount=currentCount;
        }else if(currentCount==maxCount){
            list.add(value);
        }
    }
}
