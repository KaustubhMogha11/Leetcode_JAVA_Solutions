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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)return head;
        head.next=sortList(head.next);
        if(head.val<=head.next.val)return head;
        else{
            ListNode p=head;
            while(p.next!=null)
            {
                if(p.val>p.next.val)
                {
                    int temp=p.val;
                    p.val=p.next.val;
                    p.next.val=temp;
                }
                else break;
                p=p.next;
            }
        }
        return head;
    }
}