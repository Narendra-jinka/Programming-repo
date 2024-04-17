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
    public String smallestFromLeaf(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        PriorityQueue<String> pq = new PriorityQueue<>((a,b) -> a.compareTo(b));
        helper(root, sb, pq);
        return pq.poll();
    }
    
    public void helper(TreeNode root, StringBuilder sb, PriorityQueue<String> pq){
        if(root == null)
            return ;
        char c = (char)(root.val+'a');   // store the root value as char, it would be easy while deleting
        sb.append(c);
        if(root.left==null && root.right == null){
            pq.offer(sb.reverse().toString());  // sb.reverse does inplace reverse, hence reverse it back 
            sb.reverse();
        }
        helper(root.left, sb, pq);
        helper(root.right, sb, pq);
        sb.deleteCharAt(sb.length()-1); 
    }
}