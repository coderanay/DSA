class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n = points.length;
        int m = points[0].length;
        int seconds = 0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<m-1;j++)
            {
                int x1 = points[i][0];
                int y1 = points[i][1];
                int x2 = points[i+1][0];
                int y2 = points[i+1][1];
                int abs1 = Math.abs(x2-x1);
                int abs2 = Math.abs(y2-y1);
                seconds += Math.max(abs1,abs2);
            }
        }
        return seconds;
    }
}