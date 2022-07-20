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
    public ListNode oddEvenList(ListNode head) {
        
        if(head==null)
            return head;
        
        ListNode dummyNode=new ListNode();
        ListNode temp=dummyNode;
        ListNode curr=head.next;
        ListNode prev=head;
        int i=2;
        while(curr!=null && prev.next!=null)
        {
            if(i%2==0)
            {
                temp.next=curr;
                temp=temp.next;
            }else{
                prev.next=prev.next.next;
                prev=curr;
            }
          curr=curr.next;
            i++;
        }
        
        prev.next=dummyNode.next;
        temp.next=null;
        return head;
    }
}