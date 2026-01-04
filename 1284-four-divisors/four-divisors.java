class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for(int i: nums)
        {
            int cnt =2;
            int temp = i+1;
            for(int j=2;j*j<=i;j++)
            {
                if(i % j == 0)
                {
                    if(j*j != i)
                    {
                        cnt += 2;
                        temp += j;
                        temp += i/j;
                    } else 
                    {
                        cnt += 1;
                        temp += j;
                    }
                }
            }
            if(cnt == 4) ans += temp;
        }
        return ans;
    }
}