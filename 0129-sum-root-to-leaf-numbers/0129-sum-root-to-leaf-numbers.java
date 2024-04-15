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
    int total;
    public int sumNumbers(TreeNode root) {
       total = 0;
       preOrder(root,0);
    return total;
        
    }
    
    void preOrder(TreeNode root,int sum){
        //pre-order-traversal.
        if(root == null) return;
        
        
        sum = sum*10 + root.val;
        System.out.print(sum);
        if(root.left == null && root.right == null){
            total += sum;
            return;
        }
        preOrder(root.left,sum);
        preOrder(root.right,sum); 
    }
}