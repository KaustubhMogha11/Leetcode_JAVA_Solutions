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
        ArrayList<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)
        { 
         return list;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size(); // current size will have the total no of elements present at a given level in the tree
            ArrayList<Integer> levelElement = new ArrayList<>(); // internal list that will store all the elements (where no. of elements at a given level are = size) at the given level 
            for(int i =0;i<size;i++){
                TreeNode node = q.remove();
                levelElement.add(node.val);
                if(node.left!=null) q.add(node.left);// these two lines are
                if(node.right!=null) q.add(node.right);// used to add next level elements
            }
            list.add(levelElement);
        }
        return list;
    }
}