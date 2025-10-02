class Solution {
    public int captureForts(int[] forts) {
        int n = forts.length;
        int max=0;
        for(int i=0,j=0;i<n;++i)
        {
            if(forts[i] != 0)
            {
                if(forts[j] == -forts[i])
                    max = Math.max(max,i-j-1);
                j=i;    
            }
        }
        return max;
    }
}