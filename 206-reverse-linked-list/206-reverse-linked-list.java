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
    public ListNode reverseList(ListNode head) {
       //recursive 
//         if(head==null || head.next==null)
//         {
//             return head;
//         }
        
//         ListNode finalHead=reverseList(head.next);
//         ListNode temp=finalHead;
//         while(temp.next!=null)
//         {
//             temp=temp.next;
//         }
//         temp.next=head;
//         head.next=null;
        
//         return finalHead;
        
        if(head==null || head.next==null)
        {
            return head;
        }
        
//         ListNode tail=head.next;
//         ListNode temp=reverseList(head.next);
//         tail.next=head;
//         head.next=null;
        
//         return temp;
        ListNode temp;
        ListNode curr=head;
        ListNode prev=null;
        
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