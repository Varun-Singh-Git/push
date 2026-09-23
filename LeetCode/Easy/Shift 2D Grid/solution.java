class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        List<List<Integer>> res = new ArrayList<>();
        for(int Shift=0;Shift<k;Shift++){
                int[][] temp =new int[n][m];
                for(int i=0;i<n;i++){
                    for(int j=0;j<m;j++){
                        int newRow=i;
                        int newCol=j+1;
                        if (newCol == m) {
                            newCol = 0;
                            newRow++;
                        }
                        if (newRow == n) {
                            newRow = 0;
                        }
                        temp[newRow][newCol] = grid[i][j];
                    }
                }
                grid = temp;
            }
              for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < m; j++) {
                row.add(grid[i][j]);
            }

            res.add(row);
        }

        return res;
    }
}