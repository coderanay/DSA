class Solution {
    public int maxProduct(int[] nums) {
        int minEnd = nums[0];
        int maxEnd =nums[0];
        int ans = nums[0];
        int n = nums.length;
        for(int i=1;i<n;i+=1)
        {
            int val1 = minEnd * nums[i];
            int val2 = maxEnd * nums[i];
            int val3 = nums[i];

            maxEnd = Math.max(val1,Math.max(val2,val3));
            minEnd = Math.min(val1,Math.min(val2,val3));

            ans = Math.max(ans,Math.max(maxEnd,minEnd));
        }
        return ans;
    }
}

