package ru.voronin;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.val == 0 && head.next == null) return null;
        ListNode result = new ListNode(head.val);
        ListNode curr = result;
        while (head != null) {
            if (head.val != curr.val) {
                curr.next = new ListNode(head.val);
                curr = curr.next;
            }
            head = head.next;
        }
        return result;
    }
}
