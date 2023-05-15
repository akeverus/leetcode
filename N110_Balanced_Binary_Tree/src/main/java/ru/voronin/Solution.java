package ru.voronin;

public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null)  return true;
        return Height(root) != -1;
    }

    public int Height(TreeNode root) {
        if (root == null)  return 0;
        int leftHeight = Height(root.left);
        int rightHight = Height(root.right);
        if (leftHeight == -1 || rightHight == -1)  return -1;
        if (Math.abs(leftHeight - rightHight) > 1)  return -1;
        return Math.max(leftHeight, rightHight) + 1;
    }
}
