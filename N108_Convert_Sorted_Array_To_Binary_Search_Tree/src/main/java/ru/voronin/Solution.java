package ru.voronin;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return createBinarySearchTree(0, nums.length - 1, nums);
    }

    private TreeNode createBinarySearchTree(int left, int rigth, int[] nums) {
        if (left > rigth) return null;
        int center = (rigth + left) / 2;
        TreeNode root = new TreeNode(nums[center]);
        root.left = createBinarySearchTree(left, center - 1, nums);
        root.right = createBinarySearchTree(center + 1, rigth, nums);
        return root;
    }
}
