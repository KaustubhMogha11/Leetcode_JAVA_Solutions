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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        if(root==null)
            return false;
        
        if(compare(root,subRoot))
        {
            return true;
        }
        
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
    
    public boolean compare(TreeNode root1,TreeNode root2){
        if(root1==null || root2==null)
        {
            return root1==null && root2==null;
        }
        
    if(root1.val!=root2.val)
        return false;
        
          return compare(root1.left, root2.left) && compare(root1.right, root2.right);
    }
}