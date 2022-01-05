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
        
        if(k<0 || head==null || head.next==null)
            return head;
        int length=1;
        ListNode last=head;
        while(last.next!=null)
        {
            last=last.next;
            length++;
        }
        last.next=head;
        int rotations=k%length;
        int skip=length-rotations;
        
        ListNode newtail=head;
        for(int i=0;i<skip-1;i++)
        {
            newtail=newtail.next;
        }
        head=newtail.next;
        newtail.next=null;
        
        return head;
        
    }
}