package ru.voronin;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxDepth(new TreeNode(1, new TreeNode(2), null)));
    }
}