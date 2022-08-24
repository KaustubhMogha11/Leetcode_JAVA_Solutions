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
//     public static ListNode reverse(ListNode head)
//     {
//         ListNode temp;
//         ListNode prev=null;
//             ListNode curr=head;
        
//         while(curr!=null)
//         {
//             temp=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=temp;
//         }
        
//         return prev;
//     }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        
//         ListNode l3=reverse(l1);
//         ListNode l4=reverse(l2);
        ListNode dummyNode=new ListNode();
        ListNode temp=dummyNode;
        int carry=0;
        
        while(l1!=null || l2!=null || carry!=0)
        {
            int sum=0;
            if(l1!=null)
            {
                sum+=l1.val;
                  l1=l1.next;
            }
             if(l2!=null)
            {
                sum+=l2.val;
                   l2=l2.next;
            }
            sum+=carry;
            ListNode node=new ListNode(sum%10);
            temp.next=node;
            temp=temp.next;
            carry=sum/10;
            
        }
        
        return dummyNode.next;
        
    }
}