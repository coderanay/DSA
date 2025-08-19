class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n = nums.length;
        long ans=0;
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i] != 0)
            {
                cnt = 0;
            } else if(nums[i] == 0)
            {
                cnt++;
                ans += cnt;
            }
        }
        return ans;
    }
}