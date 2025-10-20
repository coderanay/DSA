class Solution {
    public int minIncrementForUnique(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int nextVal = nums[0];
        int moves=0;
        for(int i=1;i<n;i++)
        {
            if(nums[i] <= nextVal)
            {
                moves += (nextVal - nums[i])+1;
                nextVal++;
            } else nextVal = nums[i];
        }
        return moves;
    }
}