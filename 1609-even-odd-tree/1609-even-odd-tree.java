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
    public boolean isEvenOddTree(TreeNode root) {
        if (root == null) {
            return false;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean isEvenLevel = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            int prevValue = isEvenLevel ? Integer.MIN_VALUE : Integer.MAX_VALUE;

            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();

                if (isEvenLevel) {
                    if (cur.val % 2 == 0 || cur.val <= prevValue) {
                        return false;
                    }
                } else {
                    if (cur.val % 2 == 1 || cur.val >= prevValue) {
                        return false;
                    }
                }

                prevValue = cur.val;

                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }

            isEvenLevel = !isEvenLevel;
        }

        return true;
    }
}