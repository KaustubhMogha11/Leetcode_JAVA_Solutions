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
    public ListNode mergersort(ListNode head1, ListNode head2){
        if(head1==null)
            return head2;
        if(head2==null)
            return head1;
            ListNode newhead=head1;
            ListNode newtail=head1;
        if(head1.val>head2.val){
            newhead=head2;
            newtail=head2;
            head2=head2.next;
                
        }else
        {
             newhead=head1;
            newtail=head1;
            head1=head1.next;
        }
         while(head1!=null && head2!=null)
        {
            if(head1.val<head2.val)
            {
                newtail.next=head1;
                newtail=newtail.next;
                head1=head1.next;
            }
            else
            {
                newtail.next=head2;
                newtail=newtail.next;
                head2=head2.next;
            }
        }
        
        if(head1!=null)
        {
            newtail.next=head1;
        }
         if(head2!=null)
        {
            newtail.next=head2;
        }
        return newhead;
    }
    public ListNode findmid(ListNode head){
        if(head==null || head.next==null)
            return head;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode sortList(ListNode head) {
     if(head==null || head.next==null)
        return head;
        ListNode mid=findmid(head);
        ListNode half1=head;
        ListNode half2=mid.next;
        mid.next=null;
        half1=sortList(half1);
        half2=sortList(half2);
        ListNode finalhead=mergersort(half1, half2);
        return finalhead;
    }
}