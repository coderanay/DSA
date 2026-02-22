class Solution {
    public int findGap(String s)
    {
        int res = 0;
        int curr = 0, prev = -1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '1')
            {
                prev = curr;
                curr = i;
                int ans = Integer.valueOf(curr)-Integer.valueOf(prev);
                res = Math.max(res,ans);
            }
        }
        return res;
    }
    public int binaryGap(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0)
        {
            int bit = n % 2;
            sb.append(bit);
            n /= 2;
        }
        sb.reverse();
        int max = findGap(sb.toString());
        return max;
    }
}