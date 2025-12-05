class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int part=0;
        int[] suff = new int[n];
        pre[0] = nums[0];
        suff[n-1] = nums[n-1];
        for(int i=1;i<n;i++)
        {
            pre[i] = pre[i-1] + nums[i];
        }
        for(int i=n-2;i>=0;i--)
        {
            suff[i] = suff[i+1] + nums[i];
        }

        for(int i=0,j=0;i<n && j<n-1;i++,j++)
        {
            int diff = Math.abs(pre[i] - suff[i+1]);
            if(diff % 2 == 0) part++;
        }
        return part;
    }
}