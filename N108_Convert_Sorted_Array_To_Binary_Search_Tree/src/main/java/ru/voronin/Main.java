package ru.voronin;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        BinaryTreePrinter.printNode(solution.sortedArrayToBST(new int[]{-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5}));
    }
}