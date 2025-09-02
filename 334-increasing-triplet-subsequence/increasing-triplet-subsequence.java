class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++)
        {
            int n = nums[i];
            if(n <= first)
            {
                first = n;
            } else if(n <= second)
            {
                second = n;
            }
            else return true;
        }
        return false;
    }
}