class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);
        int hi=0;
        for(int i=n-1;i>=0;i--)
        {
            if(citations[i] > hi)
            {
                hi++;
            } else break;
        }
        return hi;
    }
}