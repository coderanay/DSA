class Solution {

    public boolean isPrime(int num)
    {
        int cnt=0;
        for(int i=1;i<=num;i++)
        {
            if(num % i == 0)
            {
                cnt++;
            }
        }   
        return cnt == 2;
    }   
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i=left;i<=right;i++)
        {
            int ans = Integer.bitCount(i);
            if(isPrime(ans))
            {
                count++;
            }
        }

        return count;
    }
}