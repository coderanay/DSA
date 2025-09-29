class Solution {
    public int largestPerimeter(int[] nums) {
        int n = nums.length;
        int sum = 0, max =0;
        Arrays.sort(nums);
        for(int i=n-1;i>=2;i--)
        {
            if(nums[i-1] + nums[i-2] > nums[i]) return nums[i] + nums[i-1] + nums[i-2];
        }
        return 0;
    }
}