package ru.voronin;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        char leftParentheses = '(';
        char rightParentheses = ')';
        char leftSquareBrackets = '[';
        char rightSquareBrackets = ']';
        char leftBraces = '{';
        char rightBraces = '}';
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == leftParentheses) {
                stack.push(rightParentheses);
            } else if (c == leftSquareBrackets) {
                stack.push(rightSquareBrackets);
            } else if (c == leftBraces) {
                stack.push(rightBraces);
            } else if (stack.empty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.empty();
    }
}
