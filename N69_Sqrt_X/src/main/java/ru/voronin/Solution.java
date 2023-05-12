package ru.voronin;

class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        if (x == 1) return 1;
        int left = 0;
        int rigth = x;
        int result;
        while (rigth - left > 1) {
            int middle = left + (rigth - left) / 2;
            if (middle > 46341) {
                middle = 46340;
                int end = middle * middle;
                if (end == x) return middle;
                result = Integer.MAX_VALUE;
            } else {
                result = middle * middle;
            }
            if (result == x) return middle;
            if (x < result) {
                rigth = middle;
            } else {
                left = middle;
            }
        }
        return left;
    }
}
