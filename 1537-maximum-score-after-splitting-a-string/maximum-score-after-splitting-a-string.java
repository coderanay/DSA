class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int max = 0;
        for(int k=0;k<=n-2;k++)
        {
            int cnt0 = 0;
            int cnt1 = 0;
            for(int i=0;i<=k;i++)
            {
                if(s.charAt(i) == '0') cnt0++;
            }
            for(int j=k+1;j<n;j++)
            {
                if(s.charAt(j) == '1') cnt1++;
            }
            max = Math.max(max,cnt0+cnt1);
        }

        return max;
    }
}