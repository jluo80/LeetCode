/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// AFTER OPTIMIZATION
// Basic idea: it's kind of like greedy algorithm. We create an
// empty linked list starting with "head" node. And add the relatively
// smaller node to it by comparing nodes in l1 and l2. Keep doing this
// until the next node is null, so that we can directly add up the rest
// of the nodes to the "head" linked list.
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if(l1 == null) current.next = l2;
        if(l2 == null) current.next = l1;
        return head.next;
    }
}

//// BEFORE OPTIMIZATION
// public class Solution {
//     public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//// 1.There is no need to seperate the l1/l2 null or not discussion in the beginning.
//         if(l1 == null && l2 == null) return null;
//         if(l1 == null) return l2;
//         if(l2 == null) return l1;
//// 2.There is no need to set dummy node for linked list l1 and l2.
//// Since we can dynamically change l1/l2 as long as we can keep the
//// the node sequence in linked list head.
//         ListNode d1 = new ListNode(0);
//         d1.next = l1;
//         ListNode d2 = new ListNode(0);
//         d2.next = l2;
//         ListNode head = new ListNode(0);
//         ListNode current = head;
//         while(d1.next != null && d2.next != null) {
//             if(d1.next.val <= d2.next.val) {
//                 current.next = d1.next;
//                 d1.next = d1.next.next;
//                 current = current.next;
//             } else {
//                 current.next = d2.next;
//                 d2.next = d2.next.next;
//                 current = current.next;
//             }
//         }
//         if(d1.next == null) current.next = d2.next;
//         if(d2.next == null) current.next = d1.next;
//         return head.next;
//     }
// }

