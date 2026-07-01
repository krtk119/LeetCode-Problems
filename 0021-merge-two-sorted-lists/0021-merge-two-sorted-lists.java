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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);     // fake starting node
        ListNode current = dummy;              // pointer we move forward

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;          // attach list1's node
                list1 = list1.next;            // advance list1
            } else {
                current.next = list2;          // attach list2's node
                list2 = list2.next;            // advance list2
            }
            current = current.next;            // advance current
        }

        if (list1 != null) current.next = list1;  // leftover nodes
        if (list2 != null) current.next = list2;

        return dummy.next;     
    }
}