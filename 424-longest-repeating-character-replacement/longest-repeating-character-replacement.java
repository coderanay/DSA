class Solution {
    public int find(int[] count)
    {
        int max = 0;
        for(int num: count) max = Math.max(max,num);
        return max;
    }
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int maxLen = 0;
        int low=0;
        int[] count = new int[256];
        for(int high=0;high<n;high++)
        {
            count[s.charAt(high) - 'A']++;
            int len = high - low + 1;
            int max = find(count);
            int diff = len - max;
            while(diff > k)
            {
                count[s.charAt(low) - 'A']--;
                low++;
                len = high - low + 1;
                max = find(count);
                diff = len - max;
            }
            maxLen = Math.max(maxLen,len);
        }
        return maxLen;
    }
}