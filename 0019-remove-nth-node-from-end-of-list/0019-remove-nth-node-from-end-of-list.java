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
    public int len(ListNode head){
        int count=0;
        ListNode cur=head;
        while(cur !=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=len(head);
        if(len==1){
            return null;
        }
        int del=len-n;
        if(del == 0){
            head=head.next;
        }
        int c=0;
        ListNode cur=head;
        while(cur!=null){
            if(c+1==del){
                ListNode nextNode=cur.next;
                cur.next=nextNode.next;
                break;
            }
            c++;
            cur=cur.next;
        }
        return head;
    }
}