/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // ListNode temp is used to store the final result.
        ListNode temp = new ListNode(0);
        ListNode p = l1, q = l2, current = temp;
        int carry = 0;
        // If both p and q reach the end, then the loop will be terminated
        /**
         * x, y represent the digit that is iterated. If one of the ListNode is 3 digits, the other is 2 digits,
         * then when the iterator comes to that digit == null, we assign 0 to it.
         */
        while(p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            // ListNode(int x) { val = x; } constructor
            current.next = new ListNode(sum % 10);
            current = current.next;
            if(p != null) p = p.next;
            if(q != null) q = q.next;
        }
        //  Check if carry == 1, for example, 500 + 500 = 1000. Then we have to append a new digit to the ListNode.
        if(carry == 1) {
            current.next = new ListNode(carry);
        }
        return temp.next;
    }
}