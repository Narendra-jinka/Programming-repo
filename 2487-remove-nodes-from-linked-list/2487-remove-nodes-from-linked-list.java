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
    public ListNode reverse(ListNode head){
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
    public ListNode removeNodes(ListNode head) {
        head=reverse(head);
        int prevval=head.val;
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<prevval){
                prev.next=temp.next;
                temp=temp.next;
                continue;
            }
            prev=temp;
            prevval=temp.val;
            temp=temp.next;
        }
        return reverse(head);
    }
}