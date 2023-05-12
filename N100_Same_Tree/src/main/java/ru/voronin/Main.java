package ru.voronin;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isSameTree(new TreeNode(1, new TreeNode(2), null), new TreeNode(1, null, new TreeNode(3))));
    }
}