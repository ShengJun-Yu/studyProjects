package Algorithm.link_apply;

import java.util.Stack;

public class BracketsMatch {

    public boolean isValid(String s) {
        Stack stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char charAtI = s.charAt(i);
            if (charAtI == ')' || charAtI == '}' || charAtI == ']') {
                if (!stack.empty()) {
                    char popChar = (char) stack.pop();
                    if (!match(popChar, charAtI)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                stack.push(charAtI);
            }
        }
        if (stack.empty())
            return true;
        return false;
    }

    public boolean match(char left, char right) {
        if (left == '(' && right == ')' || (left == '{' && right == '}') ||
                (left == '[' && right == ']')) {
            return true;
        }
        return false;
    }

    public boolean isValid2(String s) {
        int length = s.length();
        if (length == 0) {
            return true;
        }
        char[] charArray = new char[length];
        int top = -1;
        for (int i = 0; i < length; i++) {
            char charAtI = s.charAt(i);
            if (charAtI == ')' || charAtI == '}' || charAtI == ']') {
                if (top > -1) {
                    char topChar = charArray[top--];
                    if (!match(topChar, charAtI)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                charArray[++top] = charAtI;
            }
        }
        if (top > -1) {
            return false;
        }
        return true;
    }


}
