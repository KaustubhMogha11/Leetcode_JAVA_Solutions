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
    int ans=0;
    int size=0;
    public int getDecimalValue(ListNode head) {
        
         reverse(head, 0);
        return ans;
        
    }
    
      public void reverse(ListNode head, int length){
           
          if(head==null)
          {
              size=length;
              return;
          }
          
          reverse(head.next,length+1);
           
          if(head.val==1)
          {
              ans+=head.val*Math.pow(2,size-length-1);
          }
    }
}