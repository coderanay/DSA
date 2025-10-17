class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++)
        {
            int  left = i+1;
            int right =nums.length-1;
            while(left < right)
            {
                int sum = nums[i] + nums[left] + nums[right];
                int absVal = Math.abs(target-sum);
                if(absVal < min)
                { 
                    min = absVal;
                    ans = sum;
                } 
                else if(sum > target) right--;
                else left++;
            }
        }
        return ans;
    }
}