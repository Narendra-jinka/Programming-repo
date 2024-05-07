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
    
    ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode cur=head;
        ListNode next=null;
        
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        head=prev;
        return head;
    }
    
    public ListNode doubleIt(ListNode head) {
        head = reverse(head);
        int carry = 0;
        ListNode cur = head;
        while (cur != null) {
            int num = cur.val * 2 + carry;
            cur.val = num % 10;
            carry = num / 10;
            if (cur.next == null && carry > 0) { // If it's the last node and there's a carry
                cur.next = new ListNode(carry);
                break; // Reset carry after adding the new node
            }
            cur = cur.next;
        }
        return reverse(head);
    }
}
