class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if(n % 2 == 0)
        {
            int mid = (nums[(n/2)-1] + nums[n/2])/2;
            for(int i=0;i<n;i++)
            {
                nums[i] = Math.abs(mid - nums[i]);
            }
            int sum = 0;
            for(int i=0;i<n;i++) sum += nums[i];
            return sum;
        } else 
        {
            int mid = nums[n/2];
            
            for(int i=0;i<n;i++)
            {
                nums[i] = Math.abs(mid - nums[i]);
            }
            int sum = 0;
            for(int i=0;i<n;i++) sum += nums[i];
            return sum;
        }
    }
}