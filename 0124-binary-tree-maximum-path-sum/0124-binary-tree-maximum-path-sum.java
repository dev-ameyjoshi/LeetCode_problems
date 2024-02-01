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
    public int maxPathSum(TreeNode root) {
        solve(root);
        return res;
    }
    
    public int solve(TreeNode root){
        
        if(root  == null) return 0;
        
        int leftside = solve(root.left);
        int rightside = solve(root.right);
        
        int temp = Math.max(Math.max(leftside,rightside)+ root.val,root.val);
        int ans = Math.max(temp,leftside+rightside+root.val);
        res = Math.max(res,ans);
        
        return temp;
        
    }
}