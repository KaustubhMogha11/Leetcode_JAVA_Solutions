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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        

         ListNode dummyNode=new ListNode();
        ListNode temp=dummyNode;
        ListNode l3=reverse(l1);
        ListNode l4=reverse(l2);
        int carry=0;
        while(l3!=null || l4!=null || carry==1)
        {
            int sum=0;
            if(l3!=null)
            {
                sum+=l3.val;
                l3=l3.next;
            }
            
            if(l4!=null)
            {
                sum+=l4.val;
                l4=l4.next;
            }
            sum+=carry;
            ListNode node=new ListNode(sum%10);
            temp.next=node;
            temp=temp.next;
            carry=sum/10;
            }
        return reverse(dummyNode.next);
            
    }
    
    public ListNode reverse(ListNode head){
        if(head==null)
            return head;
        
        ListNode prev=null;
        ListNode curr=head;
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