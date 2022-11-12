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
    public boolean isSymmetric(TreeNode root) {
      
        if(root==null)
            return false;
        
        return ans(root.left,root.right);
    }
    
    public boolean ans(TreeNode root1,TreeNode root2)
    {
        if(root1==null || root2==null)
            return root1==root2;
        
        if(root1.val!=root2.val)
            return false;
        
        
        return ans(root1.left,root2.right) && ans(root1.right,root2.left);
        
        
        
        
    }
}