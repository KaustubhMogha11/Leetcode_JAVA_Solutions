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
    public static ListNode mid(ListNode head){
        
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        return slow;
    }
    
    public static ListNode reverse(ListNode head){
        
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
    public boolean isPalindrome(ListNode head) {
        if(head==null)
            return false;
        ListNode mid=mid(head);
        ListNode newHead=reverse(mid);
        
        while(newHead!=null)
        {
            if(head.val!=newHead.val)
                return false;
            
            head=head.next;
            newHead=newHead.next;
        }
        
        return true;
    }
}