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
   int sum=0;
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        
//        if(root == null) return 0;
        
//         int sum = 0;
//         if(root.val >= low && root.val <= high) {
//             sum += root.val;
//         }
        
//         return sum + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
         
        if (root == null) return sum;
        if (low <= root.val && high >= root.val) 
            sum += root.val;
        if (low < root.val)
            sum = rangeSumBST(root.left, low, high);
        if (high > root.val)
            sum = rangeSumBST(root.right, low, high);
        return sum;
    }
}