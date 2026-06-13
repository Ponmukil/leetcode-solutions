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
    ListNode head = null;
    public ListNode reverseLL(ListNode head){
        if(head.next == null){
            this.head = head;
            return this.head;
        }
        return reverseLL(head.next).next = head; 
    }
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        reverseLL(head).next = null;
        return this.head;
    }
}