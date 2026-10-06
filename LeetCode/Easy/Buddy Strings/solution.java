class Solution {
    public boolean buddyStrings(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        // Case 1: Strings are already equal
        if (s.equals(goal)) {

            boolean[] seen = new boolean[26];

            for (char c : s.toCharArray()) {

                if (seen[c - 'a']) {
                    return true;
                }

                seen[c - 'a'] = true;
            }

            return false;
        }

        // Store the positions where strings are different
        int first = -1;
        int second = -1;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != goal.charAt(i)) {

                if (first == -1) {
                    first = i;
                } else if (second == -1) {
                    second = i;
                } else {
                    // More than 2 differences
                    return false;
                }
            }
        }

        // Must have exactly 2 different positions
        if (second == -1) {
            return false;
        }

        // Check whether swapping them makes the strings equal
        return s.charAt(first) == goal.charAt(second)
            && s.charAt(second) == goal.charAt(first);
    }
}