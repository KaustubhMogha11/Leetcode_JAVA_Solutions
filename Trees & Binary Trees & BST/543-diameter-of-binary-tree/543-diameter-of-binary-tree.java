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
     // public int height(TreeNode root){
//          if(root==null)
//              return 0;
//          return (Math.max(height(root.left),height(root.right)))+1;
//      }
//     public int diameterOfBinaryTree(TreeNode root) {
     
//         if(root==null)
//             return 0;
//         int option1=height(root.left)+height(root.right);
//         int option2=diameterOfBinaryTree(root.left);
//         int option3=diameterOfBinaryTree(root.right);
        
//         return Math.max(option1, Math.max(option2,option3));
//     }
// }
          int max = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        
        diameterCalculate(root);
        
        return max;
        
    }
    
    private int diameterCalculate(TreeNode root) {
        if (root == null) {
            return 0;
            
        } else {
            
            int left = diameterCalculate(root.left);
            int right = diameterCalculate(root.right);
            
            max = Math.max(left + right, max);
            
            return Math.max(left, right) + 1;
        }
    }
}