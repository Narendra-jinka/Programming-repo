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
    public void helper(TreeNode root,int target){
        if(root == null) return;
        
        helper(root.left,target);
        helper(root.right,target);
        
        if(check(root.left) && root.left.val==target){
            root.left=null;
        }
        if(check(root.right) && root.right.val==target){
            root.right=null;
        }
        
    }
    
    public boolean check(TreeNode node){
        if(node == null ) return false;
        
        return node.left==null && node.right==null;
    }
    public TreeNode removeLeafNodes(TreeNode root, int target) {
       
        helper(root,target);
        if(check(root) && root.val==target ) return null;
        return root;
    }
}