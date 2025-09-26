import java.util.Arrays;

class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums); 
        int ans = 0; 
        int n = nums.length;
        for (int i = n - 1; i >= 2; i--) {
            int lo = 0, hi = i - 1;
            while (lo < hi) {
                if (nums[lo] + nums[hi] > nums[i]) {
                    ans += (hi - lo); 
                    hi--; 
                } else {
                    lo++;
                }
            }
        }
        return ans; 
    }
}
