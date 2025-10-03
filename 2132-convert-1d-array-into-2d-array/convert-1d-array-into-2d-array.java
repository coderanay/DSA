class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] d=new int[m][n];
        int idx=0;
        if(m * n != original.length) return new int[0][0];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n && idx<original.length;j++)
            {
                d[i][j] = original[idx++];
            }
        }
        return d;
    }
}