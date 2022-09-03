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
    int count=0;
    public int pathSum(TreeNode root, int targetSum) {
           if(root==null)
               return 0;
        
        pathSumm(root,targetSum,0);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);
        return count;
    }
    
    public void pathSumm(TreeNode root,int targetSum,long sum){
          if(root==null)
              return ;
        
        if(sum+root.val==targetSum){
            count++;
        }
        
        pathSumm(root.left,targetSum,sum+root.val);
        pathSumm(root.right,targetSum,sum+root.val);
    
        // return count;
    
    }
}
