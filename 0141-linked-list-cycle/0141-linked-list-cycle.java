/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode cur=head;

        while(cur!=null){
            if(cur.val == Integer.MIN_VALUE){
                return true;
            }
            else{
                cur.val=Integer.MIN_VALUE;
                cur=cur.next;
            }
        }
        return false;
    }
}