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
    public int diameterOfBinaryTree(TreeNode root) {
       
        if(root==null)
            return 0;
        
               int opt1=height(root.left)+height(root.right);
        int opt2=diameterOfBinaryTree(root.left);
        int opt3=diameterOfBinaryTree(root.right);
        return Math.max(opt1,Math.max(opt2,opt3));
    }
    
     public int height(TreeNode root){
        if(root==null)
            return 0;
        
        return 1+Math.max(height(root.left),height(root.right));
    }
}