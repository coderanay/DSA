class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        int len = 0;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i] < nums[i+1])
            {
                cnt++;
                len = Math.max(len,cnt);
            } else cnt = 0;
        }
        return len+1;
    }
}