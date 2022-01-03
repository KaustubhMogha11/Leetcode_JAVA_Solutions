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
    public ListNode middleNode(ListNode head){
        if(head==null || head.next==null)
            return head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverseList(ListNode head){
        if(head==null)
            return head;
        ListNode curr=head;
            ListNode prev=null;
            ListNode temp;
            while(curr!=null)
            {
                temp=curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
            }
            return prev;
            
            
    }
    public void reorderList(ListNode head) {
     
        if(head==null)
            return ;
        
        ListNode mid=middleNode(head);
        ListNode hs=reverseList(mid);
        ListNode hf=head;
        while(hf!=null && hs!=null)
        {
            ListNode temp=hf.next;
            hf.next=hs;
            hf=temp;
            
            temp=hs.next;
            hs.next=hf;
            hs=temp;
            }
        if(hf!=null)
        {
            hf.next=null;
        }
        
    }
}