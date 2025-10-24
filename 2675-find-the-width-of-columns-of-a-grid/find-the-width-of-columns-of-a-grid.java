class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] ans = new int[n];
        for (int col = 0; col < n; col++) {
            int maxLen = 0;
            for (int row = 0; row < m; row++) {
                int len = String.valueOf(grid[row][col]).length();
                maxLen = Math.max(maxLen, len);
            }
            ans[col] = maxLen;
        }
        return ans;
    }
}
