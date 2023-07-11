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
    public ListNode rotateRight(ListNode head, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode cur = head, curt = head;
        while(cur!= null) {
            arr.add(cur.val);
            cur = cur.next;
        }
        Collections.rotate(arr, k);
        for(int i =0; i< arr.size(); i++) {
            curt.val = arr.get(i);
            curt = curt.next;
        }
        return head;
    } 
} 