/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
     public int lengthCycle(ListNode head){
         
         ListNode temp=head;
         int length=0;
         do{
             temp=temp.next;
             length++;
         }while(temp!=head);
         
             return length;
     }
    public ListNode detectCycle(ListNode head) {
        
        if(head==null)
            return head;
         ListNode fast = head;
        ListNode slow = head;
       int length=0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = lengthCycle(slow);
                break;
            }
        }

        if (length == 0) {
            return null;
        }
        
        ListNode s=head;
        ListNode f=head;
        
        while(length>0)
        {
            s=s.next;
            length--;
        }
        while(s!=f)
        {
            s=s.next;
            f=f.next;
        }
        return s;
        
    }
}