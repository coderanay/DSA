class Solution {
    public boolean isNonZero(int n)
    {
        while(n > 0)
        {
            if(n % 10 == 0) return false;
            n /= 10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<=n;i++)
        {
            int a = i;
            int b = n-i;
            if(isNonZero(a) && isNonZero(b))
            {
                return new int[]{a,b};
            }
        }
        return new int[]{};
    }
}