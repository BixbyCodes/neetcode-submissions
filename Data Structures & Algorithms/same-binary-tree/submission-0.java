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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Base Case 1: Both nodes are null, which means the trees match up to this point
        if (p == null && q == null) {
            return true;
        }
        
        // Base Case 2: One node is null but the other isn't, so the structures are different
        if (p == null || q == null) {
            return false;
        }
        
        // Base Case 3: Both nodes exist, but their values are different
        if (p.val != q.val) {
            return false;
        }
        
        // Recursive Step: Check if both the left subtrees AND the right subtrees are the same
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}