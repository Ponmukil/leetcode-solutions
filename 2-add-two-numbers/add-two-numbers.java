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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode head = new ListNode();
        ListNode curr = head;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            int digit1, digit2;
            if(l1 == null) digit1 = 0;
            else digit1 = l1.val;

            if(l2 == null) digit2 = 0;
            else digit2 = l2.val;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            sum = sum % 10; 

            curr.next = new ListNode(sum);
            curr = curr.next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        
        ListNode result = head.next;
        head.next = null;

        return result;


    }
}