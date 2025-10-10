class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int[] dp = new int[n];
        for(int i=n-1;i>=0;i--)
        {
            dp[i] = (i + k < n ? dp[i + k] : 0) + energy[i];
        }
        int max=Integer.MIN_VALUE;
        for(int x: dp) max=Math.max(max,x);
        return max;
    }
}