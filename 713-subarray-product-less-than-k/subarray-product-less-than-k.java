class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;

        int prod = 1, ans = 0;
        int left = 0, n = nums.length;

        for (int right = 0; right < n; right++) {
            prod *= nums[right];

            for (; prod >= k; left++) {
                prod /= nums[left];
            }

            ans += right - left + 1;
        }
        return ans;
    }
}
