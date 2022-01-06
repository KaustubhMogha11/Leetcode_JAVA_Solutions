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
    public int getLength(ListNode head){
        if(head==null)
            return 0;
        int length=0;
        while(head!=null)
        {
            head=head.next;
            length++;
        }
        return length;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        
         if (k <= 1 || head == null) {
            return head;
        }

        ListNode current = head;
        ListNode prev = null;

		int length = getLength(head);
		int count = length / k;
        while (count > 0) {
            ListNode last = prev;
            ListNode newEnd = current;

            ListNode next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = current;

            prev = newEnd;
			count--;
        }
        return head;
    }
}

