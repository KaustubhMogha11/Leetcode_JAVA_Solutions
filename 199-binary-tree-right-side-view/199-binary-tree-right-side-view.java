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
    public List<Integer> rightSideView(TreeNode root) {
       
        List<Integer> list=new ArrayList<Integer>();
        
        rightSideView(root,list,0);
        return list;
    }
    public void rightSideView(TreeNode root,List<Integer> list,int depth){
        
        if(root==null)
            return ;
        if(root!=null){
            if(depth==list.size())
                list.add(root.val);
            
             rightSideView(root.right,list,depth+1);
             rightSideView(root.left,list,depth+1);
        }
     
    } 
    
}