class Solution {
    public void reverseString(char[] s) {
        String rev = "";

        for (int i = s.length - 1; i >= 0; i--) {
            rev += s[i];
        }

        for (int i = 0; i < s.length; i++) {
            s[i] = rev.charAt(i);
        }
    }
}