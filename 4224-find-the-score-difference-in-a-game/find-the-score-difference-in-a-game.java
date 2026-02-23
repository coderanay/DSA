class Solution {
    public int scoreDifference(int[] nums) {
        int n = nums.length;
        int firstScore = 0, secondScore = 0;
        boolean isFirstActive = true;
        for(int i=0;i<n;i++)
        {
            if(nums[i] % 2 == 1)
            {
                if(isFirstActive) 
                {
                    isFirstActive = false;
                }
                else 
                {
                    isFirstActive = true;
                }
            } 
            if((i+1) % 6 == 0)
            {
                if(isFirstActive) 
                {
                    isFirstActive = false;
                }
                else
                {
                    isFirstActive = true;
                }
            } 
            if(isFirstActive) firstScore += nums[i];
            else secondScore += nums[i];
        }

        return firstScore - secondScore;
    }
}