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
    int minimum = Integer.MIN_VALUE;
    public boolean solve(TreeNode root, Integer low,Integer high){
      if(root ==null) return true;
  //when lower and upper limit is set such that the nodes are valid or not are checked.
  //The XOR operation that is performed tells if its bst or not bst
      if(low != null && root.val <= low || high != null && root.val >= high){
        return false;
      }
      
      return (
 solve(root.right,root.val,high) &&                solve(root.left,low,root.val)
      );
    }
    public boolean isValidBST(TreeNode root) {
         return solve(root,null,null);
         
    }
}