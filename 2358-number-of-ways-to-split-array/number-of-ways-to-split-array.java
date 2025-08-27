class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long total = 0;
        for (int x : nums) total += x;
        long prefix = 0;
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            prefix += nums[i];
            long suffix = total - prefix;
            if (prefix >= suffix) ans++;
        }
        return ans;
    }
}
