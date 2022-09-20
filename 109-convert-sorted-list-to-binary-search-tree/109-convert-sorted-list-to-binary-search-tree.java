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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> res=new ArrayList<>();
    public TreeNode sortedListToBST(ListNode head) {
        
        if(head==null)
            return null;
        
        while(head!=null)
        {
            res.add(head.val);
            head=head.next;
            
        }
        
        
   return construct(res,0,res.size()-1);
    }
    public TreeNode construct(List<Integer> res, int left, int right){
        if(left>right){
            return null;
        }
        int mid=(left+right)/2;
        TreeNode root = new TreeNode(res.get(mid));
        root.left=construct(res,left,mid-1);
        root.right=construct(res,mid+1,right);
        return root;
    }
}