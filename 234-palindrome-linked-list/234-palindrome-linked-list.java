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
    public boolean isPalindrome(ListNode head) {
        
        if(head==null)
            return false;
        
        ListNode head1=head;
        ListNode mid=mid(head);
        ListNode head2=reverse(mid);
        
        while(head2!=null)
        {
            if(head1.val!=head2.val)
                return false;
            
            head1=head1.next;
            head2=head2.next;
        }
        
        return true;
    }
    
    public ListNode mid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    public ListNode reverse(ListNode head){
        ListNode temp;
        ListNode prev=null;
        ListNode curr=head;
        
        while(curr!=null)
        {
            temp=curr.next;
            curr.next=prev;
            prev=curr;
        curr=temp;
        }
        
        return prev;
    }
}