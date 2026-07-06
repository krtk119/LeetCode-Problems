class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;              // start at head

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;  // skip the duplicate
            } else {
                current = current.next;            // move forward
            }
        }

        return head;
    }
}