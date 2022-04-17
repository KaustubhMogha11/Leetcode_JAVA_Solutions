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
TreeNode newRoot = null;
TreeNode current = null;
public TreeNode increasingBST(TreeNode root) {
newRoot = new TreeNode(root.val);
current = newRoot;

    createSkewedBST(root);
    return newRoot.right;
}

public void createSkewedBST(TreeNode root){
    if(root == null)
        return;
    
    createSkewedBST(root.left);
    
    current.right = new TreeNode(root.val);
    current = current.right;
    
    createSkewedBST(root.right);
}
}