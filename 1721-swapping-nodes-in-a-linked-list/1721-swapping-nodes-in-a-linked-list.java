/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int length(ListNode head)
    {
        if(head==null)
            return 0;
        int l=1;
        while(head!=null){
            head=head.next;
            l++;
        }
        return l;
    }
    public ListNode swapNodes(ListNode head, int k) {
        
        if(head==null || k<1)
            return head;
        ListNode curr=head;
        ListNode prev=head;
        int l=length(head);
        for(int i=1; curr!=null && i<k; i++)
        {
            curr=curr.next;
        }
         for(int i=1; prev!=null && i<l-k; i++)
         {
             prev=prev.next;
         }
        
        int temp=prev.val;
        prev.val=curr.val;
        curr.val=temp;
        return head;
    }
}