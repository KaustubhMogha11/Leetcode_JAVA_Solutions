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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode prev=head;
        ListNode p2=head;
        
        while(n>0)
        {
            p2=p2.next;
            n--;
        }
        
        if(p2==null)
        {
            return head.next;
        }
      
        while(p2.next!=null)
        {
            prev=prev.next;
            p2=p2.next;
        }
        
        prev.next=prev.next.next;
        
        return head;
        
    }
}