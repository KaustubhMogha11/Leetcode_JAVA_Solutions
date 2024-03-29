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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
       
        if(left==right)
            return head;
        
      
        ListNode temp;
        ListNode prev=null;
        ListNode curr=head;
        
        for(int i=0;i<left-1;i++)
        {
            prev=curr;
            curr=curr.next;
        }
         ListNode last=prev;
        ListNode newEnd=curr;
        
        // ListNode last=prev;
        // ListNode newEnd=curr;
        
        for(int i=0;i<right-left+1;i++)
        {
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        
       if(last!=null)
        {
            last.next=prev;
        }else{
            head=prev;
        }
        
        newEnd.next=curr;
        return head;
    }
}