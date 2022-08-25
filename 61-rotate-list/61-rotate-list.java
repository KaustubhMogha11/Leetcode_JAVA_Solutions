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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(k==0 || head==null)
            return head;
        
      ListNode last=head;
        int len=1;
        while(last.next!=null)
        {
            last=last.next;
            len++;
        }
        last.next=head;
        int rotations=k%len;
        int skip=len-rotations;
        ListNode tail=head;
        for(int i=0;i<skip-1;i++)
        {
            tail=tail.next;
        }
        
        head=tail.next;
        tail.next=null;
        
        return head;
    }
}