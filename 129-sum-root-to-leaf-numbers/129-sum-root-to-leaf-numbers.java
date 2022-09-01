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
    public int sumNumbers(TreeNode root) {
        
        if(root==null)
            return 0;
        
        List<Integer> list=new ArrayList<>();
        List<Integer> ans=ans(root,"",list);
        int sum=0;
        for(int i=0;i<list.size();i++)
        {
            sum+=ans.get(i);
        }
        
        return sum;
    }
    public List<Integer> ans(TreeNode root,String str,List<Integer> ans)
    {
       if(root==null)
           return null;
        
        if(root.left==null && root.right==null){
            ans.add(Integer.parseInt(str+root.val));
                return ans;
        }

             ans(root.left,str+root.val,ans);
              ans(root.right,str+root.val,ans);
        
        return ans;
}
}