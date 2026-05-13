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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean zz = true;
        while(!q.isEmpty()){
            int len = q.size();
            List<Integer> cur = new ArrayList<>();
            for(int i=0;i<len;i++){
                TreeNode temp = q.poll();
                if (zz) cur.addLast(temp.val) ; 
                else  cur.addFirst(temp.val);
                if(temp.left != null) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right); 
            }
            list.add(cur);
            zz = !zz;

        }

        return list;
    }
}