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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> list=new ArrayList<>();
        if(root==null)
            return list;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer> levelElement=new ArrayList<>();
            int n=q.size();
            
            for(int i=0;i<n;i++)
            {
                TreeNode node=q.poll();
                levelElement.add(node.val);
                
                 if(node.left!=null) q.add(node.left);// these two lines are
                if(node.right!=null) q.add(node.right);
            }
               list.add(levelElement);
        }
        
        for(int i=1;i<list.size();i=i+2)
        {
            Collections.reverse(list.get(i));
        }
        
        return list;
    }
}