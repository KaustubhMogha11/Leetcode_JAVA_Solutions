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
        
//         if(root==null)
//             return null;
        
//         if(root.left==null & root.right==null)
//         {
//             List<String> output=new ArrayList<>();
//             output.add(root.val);
//         }
        
//         List<String> leftoutput=binaryTreePaths(root.left);
//         if(leftoutput!=null){
//             leftoutput.add(root.val);
//         }
        
//           List<String> rightoutput=binaryTreePaths(root.right);
//         if(rightoutput!=null){
//             rightoutput.add(root.val);
//         }else{
//             return null;
//         }
        List <String> ans= new ArrayList<>();
           binaryTreePathsH(root ,ans, "");
        return ans;
    }
     public List<String> binaryTreePathsH(TreeNode root, List<String> ans, String str){
         
         if(root==null)
             return null;
         
         if(root.left==null & root.right==null)
         {
             ans.add(str+root.val);
             return ans;
         }
         binaryTreePathsH(root.left,ans,str + root.val+"->");
            binaryTreePathsH(root.right,ans,str + root.val+"->");
         
         return ans;
     }
}