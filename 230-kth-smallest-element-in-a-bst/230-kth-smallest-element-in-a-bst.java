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
    int count=0;
    int res=Integer.MIN_VALUE;
    public int kthSmallest(TreeNode root, int k) {
        
        ans(root,k);
        return res;
    }
    
    public void ans(TreeNode root,int k)
    {
        if(root==null)
            return ;
        
        ans(root.left,k);
        count++;
        if(count==k)
        {
            res=root.val;
        }
            
        ans(root.right,k);
    }
}