class Solution {
    public boolean isIsomorphic(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {

            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            for (int j = i + 1; j < s1.length(); j++) {

                if (s1.charAt(j) == c1 && s2.charAt(j) != c2) {
                    return false;
                }

                if (s1.charAt(j) != c1 && s2.charAt(j) == c2) {
                    return false;
                }
            }
        }

        return true;
    }
}