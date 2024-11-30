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
    int count = Integer.MIN_VALUE;
    int goodNodes = 0; 
    public int goodNodes(TreeNode root) {
      validNodes(root,count);
      return goodNodes;
    }

    public void validNodes(TreeNode root,int count){
      if(count <= root.val){
        goodNodes++;
      }

      if(root.right != null){
        validNodes(root.right,Math.max(root.val,count));
      }
      
      if(root.left != null){
        validNodes(root.left,Math.max(root.val,count));
      }
    }













}