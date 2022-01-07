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
        while(head!=null){
            head=head.next;
            length++;
        }
        return length;
    } 
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(n<1 || head==null)
            return head;
        int l=getLength(head);
        ListNode temp=head;
        int count=l-n;
         if(n==l){
            head = head.next;
            return head;
        }
         int removeAt = l-n;
        ListNode node = head;
        while(removeAt>1){
            node = node.next;
            removeAt--;
        }
        if(n == 1){
            node.next = null;
        }
        else{
            node.next = node.next.next;
        }
        return head;
    }
}