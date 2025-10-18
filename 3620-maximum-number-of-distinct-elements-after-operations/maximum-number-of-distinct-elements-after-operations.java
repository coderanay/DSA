class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int prev = Integer.MIN_VALUE;
        int cnt=0;
        for(int num: nums)
        {
            int start = num - k;
            int end = num + k;
            int choose = Math.max(prev+1,start);
            if(choose <= end)
            {
                cnt++;
                prev = choose;
            }
        }
        return cnt;
    }
}