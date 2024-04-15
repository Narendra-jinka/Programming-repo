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
    public int sum(TreeNode root, int sumtillnow){
        if(root == null ) return 0;
        sumtillnow = sumtillnow * 10 + root.val;
        if(root.left == null && root.right== null){
            return sumtillnow;
        }
        return sum(root.left,sumtillnow)+sum(root.right,sumtillnow);
    }
    public int sumNumbers(TreeNode root) {
        int sumtillnow = 0;
        sumtillnow=sum(root,sumtillnow);
        return sumtillnow;
    }
}