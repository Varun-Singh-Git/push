class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int count = 0;
        for (char ch : word.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                count++;
            }
        }
        
        if (count == n) {
            return true;
        }
        if (count == 0) {
            return true;
        }
        if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z' && count == 1) {
            return true;
        }

        return false;
    }
}