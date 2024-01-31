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
    int res = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        
        
        solve(root);
        return res-1;
    }
    
    public int solve(TreeNode root){
        
        // base case
        if(root == null) return 0;
        
        // Hypothesis 
        int l = solve(root.left);
        int r = solve(root.right);
        
        // Induction
        int temp_ans =  Math.max(l,r) + 1 ;
        int ans = Math.max(temp_ans,l+r+1);
        res = Math.max(res,ans);
        
        return temp_ans;
        
    }
}