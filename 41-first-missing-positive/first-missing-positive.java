class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int num=1;
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            if(nums[i] == num && nums[i] >= 1) num++;
        }
        return num;
    }
}