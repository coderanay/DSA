class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n == 1 && trust.length == 0)
        {
            return 1;
        }
        int[] count = new int[n+1];
        int m = trust.length;
        for(int i=0;i<m;i++)
        {
            int a = trust[i][0];
            int b = trust[i][1];
            count[a]--;
            count[b]++;
        }

        for(int i=0;i<count.length;i++)
        {
            if(count[i] == n-1)
            {
                return i;
            }
        }

        return -1;

    }
}