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
    
    int sum  = 0;    // Initializing Sum
    
    public int deepestLeavesSum(TreeNode root) {
        int maxDepth = maxDepth(root);
        findSum(root, 1, maxDepth);      //calling helper function
        return sum;
    }
    
    public int maxDepth(TreeNode node) {   // finding max Depth of a Tree
        if(node == null) return 0;
        return 1 + Math.max(maxDepth(node.left), maxDepth(node.right));
    }
    
    public void findSum(TreeNode node, int curr, int depth) {
        if(node != null) {
            if(curr == depth) { // if current level is equals to max Depth
                sum+=node.val;  // then add to sum
            }
            findSum(node.left, curr+1, depth);  // recursive call on left 
            findSum(node.right, curr+1, depth); // recursive call on right
        }
    }
}