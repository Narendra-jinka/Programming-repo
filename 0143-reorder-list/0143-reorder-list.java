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

/*class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }


        ArrayList<Integer> arr = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            arr.add(cur.val);
            cur = cur.next;
        }

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
*/

class Solution {
    public ListNode midNode(ListNode head){
        ListNode fast =  head, slow  =  head;
        while(fast.next!=null && fast.next.next!=null){
            fast =  fast.next.next;
            slow =  slow.next;
        }
        return slow;
    }
    
    public ListNode reverse(ListNode head){
        ListNode curr =  head, prev=  null, next = null;
        while(curr!=null){
            next  =  curr.next;
            curr.next =  prev ;
            prev =  curr;
            curr  =  next;
        }
        return prev;
    }

    
    public void reorderList(ListNode head) {
        
        ListNode midNode =  midNode(head);
        ListNode nextToMid =  midNode.next;
        midNode.next = null;
        ListNode p2 =  reverse(nextToMid);
        
        ListNode p1 =  head ,p1Next;    
        while(p1!=null && p2!=null){
            p1Next =  p1.next;                                    
			p1.next =  p2;
			           
            p1 =  p2;
            p2=p1Next;                        
        }                
    }            
}