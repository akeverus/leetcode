package ru.voronin;

class Solution {
    public int[] plusOne(int[] digits) {
        int counter = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            int newDigit;
            if (i == digits.length - 1) {
                newDigit = digits[i] + 1;
            } else {
                newDigit = digits[i] + counter;
            }
            if (counter == 1) {
                counter--;
            }
            if (newDigit == 10) {
                counter++;
                digits[i] = 0;
            } else {
                digits[i] = newDigit;
            }
            if (counter == 0) break;
            if (i == 0 && counter == 1 && digits[i] == 0) {
                int[] newDigits = new int[digits.length + 1];
                for (int j = 0; j < newDigits.length; j++) {
                    if (j == 0) {
                        newDigits[j] = 1;
                    } else {
                        newDigits[j] = digits[j - 1];
                    }
                }
                digits = newDigits;
            }
        }
        return digits;
    }
}