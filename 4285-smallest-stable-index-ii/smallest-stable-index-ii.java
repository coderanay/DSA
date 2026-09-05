class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] right=new int[n];
        int left=nums[0];
        int smallestMin = Integer.MAX_VALUE;
        right[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right[i] = Math.min(right[i+1],nums[i]);
        }

        for(int i=0;i<n;i++)
        {
            left = Math.max(left,nums[i]);
            if(left-right[i] <= k)
            {
                smallestMin = Math.min(smallestMin,i);
            }
        }

        return smallestMin == Integer.MAX_VALUE ? -1 : smallestMin;
    }
}