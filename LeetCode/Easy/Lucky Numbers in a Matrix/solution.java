class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int rows= matrix.length;
        int cols=matrix[0].length;
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                int value = matrix[i][j];
                boolean rowMin = true;
                for (int k = 0; k < cols; k++) {
                    if (matrix[i][k] < value) {
                        rowMin = false;
                        break;
                    }
                }
                boolean colMax = true;
                for (int k = 0; k < rows; k++) {
                    if (matrix[k][j] > value) {
                        colMax = false;
                        break;
                    }
                }
                 if (rowMin && colMax) {
                    ans.add(value);
                }
            }
        }return ans;  
    }
}