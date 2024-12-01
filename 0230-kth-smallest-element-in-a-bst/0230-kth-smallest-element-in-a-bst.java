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
    public int kthSmallest(TreeNode root, int k) {
        
        Stack<TreeNode> stk = new Stack<>();
        TreeNode curr = root;
      
        while(curr != null ||  !stk.isEmpty()){
          while(curr != null){
            stk.push(curr);
            curr = curr.left;
          }
          curr = stk.pop();
          k--;
          if(k == 0){
            return curr.val;
          }
          
          curr = curr.right;
        }
      
      return -1;
    }
}