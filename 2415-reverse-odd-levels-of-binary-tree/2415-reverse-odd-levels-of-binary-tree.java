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
    public TreeNode reverseOddLevels(TreeNode root) {
        
        if(root==null)
            return root;
        
        ans(root.left,root.right,1);
        return root;
    }
    
    public void ans(TreeNode node1,TreeNode node2,int lvl){
        
        if(node1==null || node2==null)
            return ;
        
         if (lvl % 2 == 1){
            int temp = node1.val;
            node1.val = node2.val;
            node2.val = temp;
        }
        
           ans(node1.left,node2.right,lvl+1);
           ans(node1.right,node2.left,lvl+1);
    }
}