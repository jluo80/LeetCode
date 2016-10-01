/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// Java always passes by value(or memory address).
public class Solution {
    public ListNode swapPairs(ListNode head) {
        // In case it is an empty link list.
        if(head == null || head.next == null) {
            return head;
        }

        // The handler "first" and "head" point to the same object(node).
        ListNode first = head;
        ListNode second = head.next;

        // Create a new object pointed by "dummyHead" handler.
        ListNode dummyHead = new ListNode(0);
        // dummyHead points to head's object.
        dummyHead.next = head;
        ListNode prev = dummyHead;

        while(second != null) {
            prev.next = second;
            first.next = second.next;
            second.next = first;

            // Update new "first" and "second".
            first = first.next;
            if(first != null && first.next != null) {
                second = first.next;
            }
            else {
                second = null;
            }
            // Update new "prev".
            prev = prev.next.next;
        }
        // "prev", "first" and "second" pointer will update every loop to the next.
        // "dummyHead" is the only pointer that won't change and always points to the first node.
        return dummyHead.next;
    }
}