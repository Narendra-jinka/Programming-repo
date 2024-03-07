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
   /* public ListNode middleNode(ListNode head) {
        
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }*/
    
    public ListNode middleNode(ListNode head) {
        ListNode dummy=head;
        int count=0;
        while(dummy !=null){
            dummy=dummy.next;
            count++;
        }
        int middle=(count/2)+1;
        int track=0;
        dummy=head;
        while(dummy !=null){
            track++;
            if(track==middle){
                head=dummy;
                break;
            }
            dummy=dummy.next;
        }
        return head;
    }
}