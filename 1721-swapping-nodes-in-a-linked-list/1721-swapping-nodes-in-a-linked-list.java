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
    int len(ListNode head){
        int h=0;
        if(head==null){
            return 0;
        }
        else{
            ListNode cur=head;
            while(cur.next!=null){
                h++;
                cur=cur.next;
            }
            return h+1;
        }
    }
    public ListNode swapNodes(ListNode head, int k) {
        int h=len(head);
        System.out.println(h);
        int[] arr=new int[h];
        int j=0;
        ListNode cur=head;
        while(cur.next!=null){
            arr[j]=cur.val;j++;
            cur=cur.next;
        }
        arr[j]=cur.val;
        int temp=arr[k-1];
        arr[k-1]=arr[h-k];
        arr[h-k]=temp;
        head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            ListNode newNode = new ListNode(arr[i]);
            current.next = newNode;
            current = newNode;
        }

        return head;
        
    }
}