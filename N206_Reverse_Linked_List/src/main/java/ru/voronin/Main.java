package ru.voronin;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.reverseList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))));
    }
}