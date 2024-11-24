class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long res = 0L;
        int c = 0;
        int min = Integer.MAX_VALUE;
        for (int[] r : matrix) {
            for (int v : r) {
                if (v < 0) {
                    c++;
                    min = Math.min(min, -v);
                    res += -v;
                } else {
                    min = Math.min(min, v);
                    res += v;
                }
            }
        }

        return c % 2 == 0 ? res : res - min * 2;
    }
}