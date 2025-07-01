class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long maxFreq = 0, l = 0, total = 0;
        int n = nums.length;

        for (int r = 0; r < n; r++) { 
            total += nums[r];
            while (l  <= r && (long)nums[r] * (r - l + 1) > total + k) { 
                total -= nums[(int)l];
                l++;
            }
            maxFreq = Math.max(maxFreq, r - l + 1);
        }
        return (int)maxFreq; 
    }
}
