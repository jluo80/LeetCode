/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/**
* Basic idea:
* In order to use one pass, we use two pointer to keep track of the lag between them.
*/
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Dummy node(whose next points to head) is useful when there is only
        // one node(head) in the linked list. We can return "dummy.next", if
        // we remove the head, then we can get a null instead of getting the head.
        // e.g linked list: [1], n = 1. Then:
        // dummy -> head = [1], if we remove the head without the dummy and use
        // "return head" as our return statement, then it will still return the
        // removed node. With dummy head, we can use return statement as "return dummy.next",
        // such that the remove operation on the head node is the same as the rest of other
        // node.
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        // e.g [dummy=0][1][2][3][4][5], n = 2.
        // first -> dummy, second -> dummy.
        ListNode first = dummy;
        ListNode second = dummy;
        // first -> [2], second -> dummy.
        for(int i = 0; i < n; i++) {
            first = first.next;
        }
        // first -> [5], second -> [3].
        while(first.next != null) {
            first = first.next;
            second = second.next;
        }
        // [1][2][3]->[5]
        second.next = second.next.next;
        //[dummy=0].next:[1]
        return dummy.next;
    }
}