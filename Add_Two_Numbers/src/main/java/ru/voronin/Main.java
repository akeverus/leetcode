package ru.voronin;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(7, new ListNode(8, new ListNode(9)));
        ListNode l2 = new ListNode(3, new ListNode(1, new ListNode(2)));
        System.out.println(solution.addTwoNumbers(l1, l2));
    }
}