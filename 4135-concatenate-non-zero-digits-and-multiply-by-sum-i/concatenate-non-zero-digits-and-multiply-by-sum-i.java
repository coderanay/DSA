class Solution {
    public long sumAndMultiply(int n) {
        long ans=0;
        while(n > 0)
        {
            int digit = n % 10;
            if(digit != 0) ans = ans * 10 + (digit);
            n /= 10;
        }

        long reverse = 0;
        while(ans > 0)
        {
            long digit = ans % 10;
            reverse = reverse * 10 + (digit);
            ans /= 10;
        }
        long sum = 0;
        long dem=reverse;
        while(dem > 0)
        {
            sum += (dem % 10);
            dem /= 10;
        }

        return sum * reverse;
    }
}