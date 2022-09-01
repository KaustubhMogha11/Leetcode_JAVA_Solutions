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
    int ans=0;
    public int sumNumbers(TreeNode root) {
        
        ans(root,"");
        return ans;
    }
    
    public  void ans(TreeNode root,String s)
    {
        if(root == null) return;
        if(root.left==null && root.right==null)
        {
            ans+=Integer.parseInt(s+root.val);
        }
        
        ans(root.left,s+root.val);
        ans(root.right,s+root.val);
        
        
    }
}