package ru.voronin;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int rigth = nums.length - 1;
        while (left <= rigth) {
            int middle = left + (rigth - left) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (target < nums[middle]) {
                rigth = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }
}
