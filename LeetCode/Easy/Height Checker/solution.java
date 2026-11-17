
class Solution {
    public int heightChecker(int[] heights) {

        // Step 1: Create frequency array
        int[] count = new int[101];

        // Step 2: Count frequency of each height
        for (int h : heights) {
            count[h]++;
        }

        // Step 3: Initialize variables
        int mismatch = 0;
        int index = 0;

        // Step 4: Generate sorted order using counting sort
        for (int h = 1; h <= 100; h++) {

            // Repeat according to frequency
            while (count[h] > 0) {

                // Compare original and sorted elements
                if (heights[index] != h) {
                    mismatch++;
                }

                // Move to next index
                index++;

                // Decrease frequency
                count[h]--;
            }
        }

        // Step 5: Return total mismatches
        return mismatch;
    }
}
