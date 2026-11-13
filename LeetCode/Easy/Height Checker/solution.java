
class Solution {
    public int heightChecker(int[] heights) {

        int[] expected = new int[heights.length];
        int[] realHeight = new int[heights.length];

        // Copy original heights into both arrays
        for (int i = 0; i < heights.length; i++) {
            expected[i] = heights[i];
            realHeight[i] = heights[i];
        }

        // Bubble Sort on expected array
        for (int i = 0; i < expected.length; i++) {

            for (int j = 0; j < expected.length - i - 1; j++) {

                if (expected[j] > expected[j + 1]) {

                    int temp = expected[j];
                    expected[j] = expected[j + 1];
                    expected[j + 1] = temp;
                }
            }
        }

        // Compare both arrays
        int count = 0;

        for (int i = 0; i < heights.length; i++) {

            if (realHeight[i] != expected[i]) {
                count++;
            }
        }

        return count;
    }
}
