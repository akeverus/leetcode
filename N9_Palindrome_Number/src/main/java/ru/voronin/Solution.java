package ru.voronin;

class Solution {
    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        String reverseNumber = new StringBuilder(number).reverse().toString();
        return number.equals(reverseNumber);
    }
}
