class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n;i++)
        {
            int num = nums[i];
            int sum = 0;
            int cnt = 0;
            for(int j=i+1;j<n;j++)
            {
                sum += nums[j];
                cnt++;
            }
            if(cnt != 0) 
            {
                double avg = sum / cnt;
                if(num > avg) 
                {
                    count++;
                }
            }
        }
        return count;
    }
}