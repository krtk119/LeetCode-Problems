class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;    // use 0 if list exhausted
            int val2 = (l2 != null) ? l2.val : 0;

            int sum = val1 + val2 + carry;            // add digits + carry
            carry = sum / 10;                          // carry is 1 if sum >= 10
            current.next = new ListNode(sum % 10);    // ones digit becomes new node
            current = current.next;

            if (l1 != null) l1 = l1.next;            // advance l1
            if (l2 != null) l2 = l2.next;            // advance l2
        }

        return dummy.next;
    }
}