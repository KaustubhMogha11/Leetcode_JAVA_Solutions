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
        
//             return reverseList(head, null);
//         }
//     public ListNode reverseList(ListNode head,ListNode prev ) {
      
//         if(head==null)
//             return prev;
//         ListNode newhead=head.next;
//         head.next=prev;
//         prev=head;
//        return  reverseList(newhead, prev);
            if(head==null || head.next==null)
                return head;
            //  ListNode newhead=reverseList(head.next);
            //  ListNode temp=newhead;
            // while(temp.next!=null)
            // {
            //     temp=temp.next;
            // }
            // temp.next=head;
            // head.next=null;
            // return newhead;
            
            // ListNode newtail=head.next;
            // ListNode newhead=reverseList(head.next);
            // newtail.next=head;
            // head.next=null;
            // return newhead;
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
}