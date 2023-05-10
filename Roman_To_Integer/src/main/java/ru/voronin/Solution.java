package ru.voronin;

class Solution {
    public int romanToInt(String s) {
        char[] roman = s.toCharArray();
        int result = 0;
        int romanLength = roman.length;
        for (int i = 0; i < romanLength; i++) {
            if (roman[i] == 'I') {
                if (i + 1 < romanLength && roman[i + 1] == 'V') {
                    result = result + 4;
                    i++;
                } else if (i + 1 < romanLength && roman[i + 1] == 'X') {
                    result = result + 9;
                    i++;
                } else {
                    result++;
                }
            } else if (roman[i] == 'X') {
                if (i + 1 < romanLength && roman[i + 1] == 'L') {
                    result = result + 40;
                    i++;
                } else if (i + 1 < romanLength && roman[i + 1] == 'C') {
                    result = result + 90;
                    i++;
                } else {
                    result = result + 10;
                }
            } else if (roman[i] == 'C') {
                if (i + 1 < romanLength && roman[i + 1] == 'D') {
                    result = result + 400;
                    i++;
                } else if (i + 1 < romanLength && roman[i + 1] == 'M') {
                    result = result + 900;
                    i++;
                } else {
                    result = result + 100;
                }
            } else if (roman[i] == 'V') {
                result = result + 5;
            } else if (roman[i] == 'L') {
                result = result + 50;
            } else if (roman[i] == 'D') {
                result = result + 500;
            } else {
                result = result + 1000;
            }
        }
        return result;
    }
}