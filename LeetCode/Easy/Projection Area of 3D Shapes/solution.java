class Solution {

    public int projectionArea(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        int area = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] > 0) {
                    area++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            int maxRow = 0;
            for (int j = 0; j < m; j++) {
                maxRow = Math.max(maxRow, grid[i][j]);
            }

            area += maxRow;
        }
        for (int i = 0; i < m; i++) {
            int maxCol = 0;
            for (int j = 0; j < n; j++) {
                maxCol = Math.max(maxCol, grid[j][i]);
            }
            area += maxCol;
        }
        return area;
    }
}