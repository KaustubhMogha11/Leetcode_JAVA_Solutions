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
    int prev=0;
    public boolean isValidBST(TreeNode root) {
        
        if(root==null)
            return true;
        
      return ans(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    
    public boolean ans(TreeNode root,long min,long max)
    {
        if(root==null)
            return true;
        
        if(root.val<=min || root.val>=max)
            return false;
        else return ans(root.left,min,root.val)&&  ans(root.right, root.val, max);  
    }
}