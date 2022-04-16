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
		public TreeNode convertBST(TreeNode root) {

			if (root == null) return root;

			convertBST(root, 0);

			return root;

		}

		public int convertBST(TreeNode root, int newVal) {

			if (root == null)
				return newVal;

			newVal = root.val + convertBST(root.right, newVal);

			root.val = newVal;

			newVal = convertBST(root.left, newVal);

			return newVal;

		}
	}