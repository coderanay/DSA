class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        List<Integer> temp=new ArrayList<>();
        while(n > 1)
        {
            for(int i=0;i<n-1;i++)
            {
                nums[i] = (nums[i] + nums[i+1]) % 10;
            }
            n--;
        }
        return nums[n-1];
    }
}