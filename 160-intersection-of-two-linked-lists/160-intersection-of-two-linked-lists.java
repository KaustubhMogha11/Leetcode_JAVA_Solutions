/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
   ListNode ptrA = headA, ptrB = headB;
	// while (ptrA != ptrB) { // loop until we found the first common node
	// ptrA = ptrA == null ? headB : ptrA.next; // once we're done with A, move to B
	// ptrB = ptrB == null ? headA : ptrB.next; // once we're done with B, move to A
	// }
	// return ptrA;
        
        while(ptrA!=ptrB)
        {
            ptrA=ptrA==null?headB:ptrA.next;
             ptrB=ptrB==null?headA:ptrB.next;
        }
        return ptrA;
}
}