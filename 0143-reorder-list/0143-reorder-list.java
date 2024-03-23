/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            // If the linked list has 0, 1, or 2 nodes, no reordering is needed
            return;
        }

        // Store the values of the linked list nodes in an ArrayList
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            arr.add(cur.val);
            cur = cur.next;
        }

        // Reorder the linked list using the values from the ArrayList
        int n = arr.size() - 1;
        head.val = arr.get(0);
        head.next = new ListNode(arr.get(n));
        cur = head.next;
        int i = 1;
        n = n - 1;
        while (i < n) {
            cur.next = new ListNode(arr.get(i));
            i++;
            cur.next.next = new ListNode(arr.get(n));
            n--;
            cur = cur.next.next;
        }
        if(arr.size()%2 == 1){
            cur.next=new ListNode(arr.get(i));
        }
    }
}
