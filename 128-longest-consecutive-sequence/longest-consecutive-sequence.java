class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int current = 1;
        int longest = 1;
        int n = nums.length;
        for(int i=1;i<n;i++)
        {
            if(nums[i] != nums[i-1]) 
            {
                if(nums[i] == nums[i-1]+1)
                {
                    current++;
                } else 
                {
                    longest = Math.max(longest,current);
                    current = 1;
                }
            }
        }
        return Math.max(longest,current);
    }
}