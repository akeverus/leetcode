package ru.voronin;

public class Solution {
    public int reverseBits(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        int answer = 0;
        for (int i = chars.length - 1; i == 0; i--) {
            answer = answer + (int)chars[i] *(int) Math.pow(2, i);
        }
        return answer;
    }
}
