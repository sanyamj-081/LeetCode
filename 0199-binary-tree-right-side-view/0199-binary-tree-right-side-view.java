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
    List<Integer> l = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        
        
        left(root,0);
        return l;
        
    }
    public void left(TreeNode root, int lvl) {
        if(root == null)
            return ;
        if(lvl == l.size() ) 
            l.add(root.val);
        
        left(root.right, lvl+1);
        left(root.left, lvl+1);
        
    }
}