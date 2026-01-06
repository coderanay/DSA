class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int mini = (int) 1e9;
        int count = 0;

        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] < 0) {
                    count++;
                }
                int val = Math.abs(matrix[i][j]);
                sum += val;
                mini = Math.min(mini, val);
            }
        }

        if (count % 2 == 1) {
            sum -= 2L * mini;
        }

        return sum;
    }
}
