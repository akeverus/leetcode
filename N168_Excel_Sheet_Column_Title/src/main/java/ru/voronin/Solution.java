package ru.voronin;

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        while (columnNumber > 0) {
            int digit = (columnNumber - 1) % 26;
            stringBuilder.append((char)('A' + digit));
            columnNumber = (columnNumber - 1) / 26;
        }
        return stringBuilder.reverse().toString();
    }
}
