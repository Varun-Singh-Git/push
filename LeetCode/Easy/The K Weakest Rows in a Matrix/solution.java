

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {

        int m = mat.length;
        int[] soldiers = new int[m];

        // Count soldiers using binary search
        for (int i = 0; i < m; i++) {

            int low = 0;
            int high = mat[i].length;

            while (low < high) {

                int mid = low + (high - low) / 2;

                if (mat[i][mid] == 1) {
                    low = mid + 1;
                } 
                else {
                    high = mid;
                }
            }

            soldiers[i] = low;
        }

        // Store row indices
        Integer[] index = new Integer[m];

        for (int i = 0; i < m; i++) {
            index[i] = i;
        }

        // Sort based on soldier count
        Arrays.sort(index, (a, b) -> {
            if (soldiers[a] == soldiers[b]) {
                return a - b;
            }
            return soldiers[a] - soldiers[b];
        });

        // Store k weakest rows
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = index[i];
        }

        return ans;
    }
}
