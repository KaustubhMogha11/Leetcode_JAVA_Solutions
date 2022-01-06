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
        
        if(k<=1 || head==null)
            return head;
        ListNode curr= head;
        ListNode prev=null;
       
        int length = getLength(head);
		int count = length / k;
        while(count>0){
             ListNode temp;
            ListNode last=prev;
            ListNode newend=curr;
            for(int i=0; curr!=null && i<k; i++)
            {
                temp=curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
            }
           
            if(last!=null)
            {
                last.next=prev;
            }else
            {
                head=prev;
            }
             newend.next = curr;
prev = newend;
          count--;
        }
       
        return head;
    }

}