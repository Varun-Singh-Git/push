class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int n = mat.length;
        int m = mat[0].length;

        // Reshape is not possible
        if (n * m != r * c) {
            return mat;
        }

        int[][] newMat = new int[r][c];

        int k = 0;
        int w = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                newMat[k][w] = mat[i][j];

                w++;

                if (w == c) {
                    w = 0;
                    k++;
                }
            }
        }

        return newMat;
    }
}