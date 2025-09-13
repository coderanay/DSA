class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length,cnt=0;
        if(n <= 1) return 0;
        for(int i=1;i<n;i++)
        {
            if(nums[i] <= nums[i-1])
            {
               cnt = cnt + nums[i-1]+1 - nums[i];
                nums[i] = nums[i - 1] + 1;
            }
        }
        return cnt;
        //[1,1,1]
        //
        //[1,2,1]
        //[1,2,3]
        //1 2 3
        //[1,5,2,4,1]
        //[1,5,7,4,1]
        //[1,5,7,12,1]
        //5
    }
}