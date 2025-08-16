class Solution {
    public int balancedStringSplit(String s) {
        int n = s.length();
        int cntr = 0, cntl = 0;
        int cnt = 0;
        int ans = 0;
        for(int i=0;i<n;i++)
        {
            if(cntr == cntl)
            {
                cnt++;
                cntr = 0;
                cntl =0;
            } 
            if(s.charAt(i) == 'R') cntr++;
            else if(s.charAt(i) == 'L') cntl++;
            ans = Math.max(ans,cnt);
        }
        return ans;
    }
}