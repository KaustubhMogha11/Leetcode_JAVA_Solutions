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
    
    private int index;
    private int ans;
    
    // Inorder traversal
    // kth-smallest element is kth element in inorder traversal
    private void traverse(TreeNode root, int k) {
        if (root != null) {
            traverse(root.left, k);
            index++;
            if (index == k) {
                ans = root.val;
                return;
            }
            traverse(root.right, k);
        }    
    }
    
    public int kthSmallest(TreeNode root, int k) {
        ans = -1;
        index = 0;
        traverse(root, k);
        return ans;
    }
}