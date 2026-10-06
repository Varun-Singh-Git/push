class Solution {
    public int numSpecial(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (mat[i][j] == 1) {

                    boolean isRow = true;
                    boolean isCol = true;

                    // Check row
                    for (int k = 0; k < m; k++) {
                        if (k != j && mat[i][k] != 0) {
                            isRow = false;
                            break;
                        }
                    }

                    // Check column
                    for (int k = 0; k < n; k++) {
                        if (k != i && mat[k][j] != 0) {
                            isCol = false;
                            break;
                        }
                    }

                    if (isRow && isCol) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}