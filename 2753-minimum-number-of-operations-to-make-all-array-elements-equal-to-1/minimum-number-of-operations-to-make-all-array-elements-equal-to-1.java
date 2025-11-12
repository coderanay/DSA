class Solution {
    public static int findGCD(int a, int b) {
        if(b == 0) return a;
        return findGCD(b,a%b);
    }
    public int minOperations(int[] nums) {
        int gcd = nums[0];
        int cnt=0;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            gcd = findGCD(gcd,nums[i]);
            if(nums[i] != 1) cnt++;
        }
        if(gcd != 1) return -1;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int  gc = nums[i];
            for(int j=i+1;j<n;j++)
            {
                gc = findGCD(gc,nums[j]);
                if(gc == 1) min = Math.min(min,j-i+1);
            }
        }
        return (cnt-1) + (min-1);
    }
}