import java.util.*;

class Solution {

    public String removeBackspace(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '#') {

                if (!stack.isEmpty()) {
                    stack.pop();
                }

            } else {
                stack.push(ch);
            }
        }

        StringBuilder ans = new StringBuilder();

        for (char ch : stack) {
            ans.append(ch);
        }

        return ans.toString();
    }

    public boolean backspaceCompare(String s, String t) {

        String str1 = removeBackspace(s);
        String str2 = removeBackspace(t);

        return str1.equals(str2);
    }
}