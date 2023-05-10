package ru.voronin;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        ListNode l1 = new ListNode(7, new ListNode(8, new ListNode(9)));
//        ListNode l2 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode l1 = new ListNode(0);
        ListNode l2 = null;
        System.out.println(solution.mergeTwoLists(l1, l2));
    }
}