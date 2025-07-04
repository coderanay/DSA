class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n][m];
        for (int[] row : dp) Arrays.fill(row, -1);
        return editDistance(word1, word2, n - 1, m - 1, dp);
    }

    private int editDistance(String word1, String word2, int i, int j, int[][] dp) {
        if (i < 0) return j + 1;
        if (j < 0) return i + 1;

        if (dp[i][j] != -1) return dp[i][j];

        if (word1.charAt(i) == word2.charAt(j)) {
            return dp[i][j] = editDistance(word1, word2, i - 1, j - 1, dp);
        } else {
            int insert = editDistance(word1, word2, i, j - 1, dp);
            int delete = editDistance(word1, word2, i - 1, j, dp);
            int replace = editDistance(word1, word2, i - 1, j - 1, dp);
            return dp[i][j] = 1 + Math.min(insert, Math.min(delete, replace));
        }
    }
}
