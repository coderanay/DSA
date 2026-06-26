class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            int tfreq=0;
            for(int j=i;j<n;j++)
            {
                int len=(j-i+1);
                if(nums[j] == target) tfreq++;
                if(tfreq !=0 && tfreq > (len/2)) cnt++;
            }
        }

        return cnt;
    }
}