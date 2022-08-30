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
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        
//         if(root==null)
//             return list;
//         Queue<TreeNode> q=new LinkedList<>();
//         q.add(root);
//         while(!q.isEmpty())
//         {
//             int size=q.size();
//             ArrayList<Integer> levelElement=new ArrayList<>();
            
//             for(int i=0;i<size;i++)
//             {
//                 TreeNode node=q.remove();
//                 levelElement.add(node.val);
//            if(node.left!=null) q.add(node.left);// these two lines are
//                 if(node.right!=null) q.add(node.right);// used to add next level elements
//             }
//             list.add(levelElement);
//         }
//         return list;
        
        if(root==null)
            return list;
        
       Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int n=q.size();
            ArrayList<Integer> levelElement=new ArrayList<>();
            
            for(int i=0;i<n;i++)
            {
                TreeNode node=q.remove();
                levelElement.add(node.val);
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
            }
            list.add(levelElement);
        }
        return list;
    }
}