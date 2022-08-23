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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)
            return list2;
        
        if(list2==null)
            return list1;
        
        ListNode newhead=null;
        ListNode newtail=null;
        if(list1.val<list2.val)
        {
            newhead=list1;
            newtail=list1;
            list1=list1.next;
        }else{
            newhead=list2;
            newtail=list2;
            list2=list2.next;
        }
        
        while(list1!=null && list2!=null)
        {
            
     if(list1.val<list2.val)
            {
                newtail.next=list1;
                newtail=newtail.next;
                list1=list1.next;
            }
            else
            {
                newtail.next=list2;
                newtail=newtail.next;
                list2=list2.next;
            }
        }
        
        if(list1!=null)
        {
            newtail.next=list1;
        }
         if(list2!=null)
        {
            newtail.next=list2;
        }
        return newhead;
    }
}