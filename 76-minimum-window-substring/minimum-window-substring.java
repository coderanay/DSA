class Solution {
    public boolean find(int[] have,int[] needed)
    {
        for(int i=0;i<256;i++)
        {
            if(have[i] < needed[i]) return false;
        }
        return true;
    }

    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[] have = new int[256];
        int[] needed = new int[256];
        int low=0;
        int res = Integer.MAX_VALUE;
        int start = 0;
        for(char ch: t.toCharArray()) needed[ch]++;
        for(int high=0;high<n;high++)
        {
            have[s.charAt(high)]++;
            while(find(have,needed))
            {
                int len = high - low + 1;
                if(res > len)
                {
                    res = len;
                    start = low;
                }
                have[s.charAt(low)]--;
                low++;
            }
        }
        return res == Integer.MAX_VALUE ? "" : s.substring(start,start+res);
    }
}