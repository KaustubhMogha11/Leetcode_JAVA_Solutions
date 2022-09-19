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
    public ListNode mid(ListNode head){
        if(head==null)
            return head;
        
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        return slow;
    }
    
     public ListNode rev(ListNode head){
        if(head==null)
            return head;
        
        ListNode curr=head;
        ListNode prev=null;
         ListNode temp;
        
        while(curr!=null){
            
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
        ListNode rev=rev(mid);
            
        while(rev!=null)
        {
            if(head.val!=rev.val)
                return false;
            
            head=head.next;
            rev=rev.next;
        }
        
        return true;
    }
}