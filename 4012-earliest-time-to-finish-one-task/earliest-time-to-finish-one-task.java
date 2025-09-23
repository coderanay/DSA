class Solution {
    public int earliestTime(int[][] tasks) {
        int n = tasks.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int first = tasks[i][0];
            int second = tasks[i][1];   
            min = Math.min(min,first+second);
        }
        return min;
    }
}