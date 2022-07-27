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
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> ans=new ArrayList<>();
        
        return ans(root,"",ans);
    }
    public List<String> ans(TreeNode root,String str,List<String> ans)
    {
        if(root==null)
            return null;
        if(root.right==null && root.left==null)
        {
            ans.add(str+root.val);
            return ans;
        }
         ans(root.left,str+root.val+"->",ans);
         ans(root.right,str+root.val+"->",ans);
        
        return ans;
    }
}