import java.util.Arrays;

class Solution {
    public boolean isPossiblePairs(int[] nums, int diff, int p) {
        int pair = 0;
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (Math.abs(nums[i + 1] - nums[i]) <= diff) {
                pair++;
                i++; 
            }
        }
        return pair >= p;
    }

    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);  
        int n = nums.length;
        int ans = 0;
        int l = 0, h = nums[n - 1] - nums[0];

        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (isPossiblePairs(nums, mid, p)) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}
