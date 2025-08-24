class Solution {
    public int minimumArea(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int minCols=n, maxCols=-1,minRows = m, maxRows =-1;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j] == 1)
                {
                     minRows = Math.min(minRows,i);
                    maxRows = Math.max(maxRows,i);
                    minCols = Math.min(minCols,j);
                    maxCols =  Math.max(maxCols,j);
                }
            }
        }
        int length =maxRows-minRows+1;
        int width =maxCols-minCols+1;
        return length * width;
    }
}