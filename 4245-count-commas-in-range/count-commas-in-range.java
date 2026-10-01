class Solution {

    public int cntComma(int x)
    {
        int cnt=0;
        while(x > 0) 
        {
            cnt++;       
            x /= 10;
        }
        if(cnt <= 3) return 0;
        else return (cnt-1)/3;
    }

    public int countCommas(int n) {
        int cnt=0;
        for(int i=1;i<=n;i++)
        {
            cnt += cntComma(i);
        }

        return cnt;
    }
}