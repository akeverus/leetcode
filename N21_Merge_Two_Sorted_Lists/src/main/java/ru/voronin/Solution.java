package ru.voronin;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        if ((list1 != null && list2 == null && list1.equals(new ListNode(0)) ) || (list1 == null && list2 != null && list2.equals(new ListNode(0)))) {
            return new ListNode(0);
        }
        ListNode head = new ListNode(0);
        ListNode curr = head;
        while (true) {
            int val1 = (list1 != null) ? list1.val : Integer.MAX_VALUE;
            int val2 = (list2 != null) ? list2.val : Integer.MAX_VALUE;
            if (val1 < val2) {
                curr.val = val1;
                list1 = list1.next;
            } else {
                curr.val = val2;
                if (list2 != null) list2 = list2.next;
            }
            if (list1 != null || list2 != null) {
                curr.next = new ListNode(0);
                curr = curr.next;
            } else{
                break;
            }
        }
        return head;
    }
}
