package ru.voronin;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        getValues(root,list);
        return list;
    }

    private void getValues(TreeNode treeNode, List<Integer> list) {
        if (treeNode != null) {
            getValues(treeNode.left, list);
            list.add(treeNode.val);
            getValues(treeNode.right, list);
        }
    }
}
