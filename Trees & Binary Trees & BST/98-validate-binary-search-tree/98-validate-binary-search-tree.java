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
    
//  public static int minimum(TreeNode root) {
// 		if (root == null) {
// 			return Integer.MAX_VALUE;
// 		}
// 		return Math.min(root.val, Math.min(minimum(root.left), minimum(root.right)));
// 	}
	
	// public static int maximum(TreeNode root) {
	// 	if (root == null) {
	// 		return Integer.MIN_VALUE;
	// 	}
	// 	return Math.max(root.val, Math.max(maximum(root.left), maximum(root.right)));
	// }
    public boolean isValidBST(TreeNode root) {
// if (root == null) {
// 			return true;
// 		}
// 		int leftMax = maximum(root.left);
// 		int rightMin = minimum(root.right);
// 		if (root.val <= leftMax) {
// 			return false;
// 		}
		
// 		if (root.val >= rightMin) {
// 			return false;
// 		}
// 		boolean isLeftBST = isValidBST(root.left);
// 		boolean isRightBST = isValidBST(root.right);
		
//         return  (isLeftBST && isRightBST); 
		
           return isValidBSTUtil(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    public boolean isValidBSTUtil(TreeNode root, long min, long max){
        if(root == null){
            return true;
        }
        else if( root.val >= max || root.val <= min){
            return false;
        }else{
        return isValidBSTUtil(root.left, min, root.val) && isValidBSTUtil(root.right, root.val, max);  
    }
}
}
 
