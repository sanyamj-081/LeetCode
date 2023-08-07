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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null)
            return null;
        ListNode cur = head;
        int l =0;
        
        while(cur !=null) {
            cur = cur.next;
            l++;
        }
        ListNode prev =head, curt = head;
        
        for(int i=0;i< l-n;i++) {
            prev = curt;
            curt = curt.next;
        }
        prev.next = curt.next;
        
        if(l == n)
            return head.next;
        
        return head;
            
    }
}