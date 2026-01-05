class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long res = 0;
        int neg = 0;
        int min = Math.abs(matrix[0][0]);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < 0) {
                    neg++;
                }
                res += Math.abs(matrix[i][j]);


                min = Math.min(Math.abs(matrix[i][j]), min);
            }
        }
        if (neg % 2 == 0) {
            return res;
        }
        return res - min * 2;
    }
}