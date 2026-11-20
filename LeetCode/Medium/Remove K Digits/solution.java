class Solution {
    public String removeKdigits(String num, int k) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < num.length(); i++) {

            char ch = num.charAt(i);

            while (!stack.isEmpty() && k > 0 && stack.peek() > ch) {
                stack.pop();
                k--;
            }

            stack.push(ch);
        }

        while (k > 0) {
            stack.pop();
            k--;
        }

        String ans = "";

        while (!stack.isEmpty()) {
            ans = stack.pop() + ans;
        }

        int i = 0;

        while (i < ans.length() && ans.charAt(i) == '0') {
            i++;
        }

        ans = ans.substring(i);

        if (ans.length() == 0) {
            return "0";
        }

        return ans;
    }
}
