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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        return buildTreehelper(preorder,inorder,0, inorder.length - 1, 0, preorder.length -1);
    }
     public TreeNode buildTreehelper(int[] preorder, int[] inorder, int inS, int inE, int preS, int preE)
     {
      if (inS > inE) {
			return null;
		}
		int rootData = preorder[preS];
	TreeNode root = new TreeNode(rootData);
		int rootInIndex = -1;
		for (int i = inS; i <= inE; i++) {
			if (inorder[i] == rootData) {
				rootInIndex = i;
				break;
			}
		}
		if (rootInIndex == -1) {
			return null;
		}
		
		int leftInS = inS;
		int leftInE = rootInIndex - 1;
		int leftPreS = preS + 1;
		int leftPreE = leftInE - leftInS + leftPreS;
		int rightInS = rootInIndex + 1;
		int rightInE = inE;
		int rightPreS = leftPreE + 1;
		int rightPreE = preE;
		root.left = buildTreehelper(preorder, inorder, leftInS, leftInE, leftPreS, leftPreE);
		root.right = buildTreehelper(preorder, inorder, rightInS, rightInE, rightPreS, rightPreE);
		return root;
	}
}