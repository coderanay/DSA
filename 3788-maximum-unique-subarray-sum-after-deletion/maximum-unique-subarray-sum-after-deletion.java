class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i] > 0) set.add(nums[i]);
            else max = Math.max(max,nums[i]);
        }
        for(int i: set) sum += i;
        return sum == 0 ? max : sum;
    }
}