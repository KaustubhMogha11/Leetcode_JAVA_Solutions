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
     ArrayList <Integer> postorderroot=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
       
        if(root==null)
            return postorderroot;
        postorderTraversal(root.left);
         postorderTraversal(root.right);
        postorderroot.add(root.val);
        
        return postorderroot;
    }
}