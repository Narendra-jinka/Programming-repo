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
    public ListNode mergeNodes(ListNode head) {
        ListNode prev=head.next;
        ListNode cur=head.next;
        head=head.next;
        int sum=0;
        while(cur!=null){
            if(cur.val ==0 ){
                prev.val=sum;
                sum=0;
                prev.next=cur.next;
                prev=cur.next;
                cur=cur.next;
            }
            else{
                sum+=cur.val;
                cur=cur.next;
            }
            
        }
        
        return head;
    }
}