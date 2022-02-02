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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
                 return buildTreehelper(inorder,postorder,0, inorder.length - 1, 0, postorder.length -1);

    }
      public TreeNode buildTreehelper(int[] inorder, int[] postorder, int inS, int inE, int postS, int postE)
     {
//           if(inS>inE)
//               return null;
//           int rootIndex=-1;
//           int rootData=postorder[proE];
//           TreeNode root=new TreeNode(rootData);
//           for(int i=inS; i<inE; i++){
//               if(inorder[i]==rootData)
//                   rootIndex=i;
//               break;    
//           }
          
//           int leftinS=inS;
//           int leftinE=rootIndex-1;
//           int leftproS=proS;
//           int leftproE=leftproS+leftinE-leftinS;
          
//           int rightinS=rootIndex+1;
//           int rightinE=inE;
//           int rightproS=leftproS+1;
//           int rightproE=proE-1;
          
//           root.left = buildTreehelper(inorder, postorder, leftinS, leftinE, leftproS, leftproE);
// 		root.right = buildTreehelper(inorder, postorder, rightinS, rightinE, rightproS, rightproE);
// 		return root;
           if(inS>inE){
            return null;
        }
        int rootData = postorder[postE];
        TreeNode root = new TreeNode(rootData);
        int i = inS;
        while(i<=inE){
            if(inorder[i]== rootData){
                break;
            }
            i++;
        }
        int leftInStart = inS;
        int leftInEnd = i-1;
        int rightInStart = i+1;
        int rightInEnd = inE;
        
        int leftPostStart = postS;
        int rightPostEnd= postE-1;
        int leftLength = leftInEnd-leftInStart+1;
        int leftPostEnd = leftPostStart+leftLength-1;
        int rightPostStart= leftPostEnd+1;
        
        
        root.left = buildTreehelper(inorder,postorder,leftInStart,leftInEnd,leftPostStart,leftPostEnd);
        root.right = buildTreehelper(inorder,postorder,rightInStart,rightInEnd,rightPostStart,rightPostEnd);
        return root;
     
	}
}