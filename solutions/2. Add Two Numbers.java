/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int rem=0;
        ListNode n=null,head=null;
        while(l1!=null&&l2!=null){
            int sum=l1.val+l2.val+rem;
            rem=0;
            if(sum>=10)
            {
                rem=sum/10;
                sum=sum%10;
                
            }
            
            if(head==null){
                head=new ListNode(sum);
                head.next=null;
                n=head;
            }else{
                ListNode node=new ListNode(sum);
                node.next=null;
                n.next=node;
                n=node;
            }
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int sum=l1.val+rem;
            rem=0;
             if(sum>=10)
            {
                rem=sum/10;
                sum=sum%10;
                
            }
            ListNode node=new ListNode(sum);
