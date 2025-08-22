class Solution {
    public int numSubmat(int[][] mat) {
        if (mat == null || mat.length == 0) return 0;
        int n = mat.length;
        int m = mat[0].length;
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = m - 1; j >= 0; j--) {
                if (mat[i][j] == 1) {
                    c++;
                } else {
                    c = 0;
                }
                arr[i][j] = c;
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int x = Integer.MAX_VALUE;
                for (int k = i; k < n; k++) {
                    x = Math.min(x, arr[k][j]);
                    if (x == 0) break;
                    ans += x;
                }
            }
        }
        return ans;
    }
}
