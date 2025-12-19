class Solution {
    public long subArrayRanges(int[] nums) {
        long total = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int currentMin = nums[i];
            int currentMax = nums[i];
            for (int j = i; j < n; j++) {
                currentMin = Math.min(currentMin, nums[j]);
                currentMax = Math.max(currentMax, nums[j]);
                total += (long)currentMax - currentMin;
            }
        }

        return total;
    }
}