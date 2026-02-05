class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] newArr = new int[n];
        for(int i=0;i<n;i++)
        { 
            if(nums[i] == 0) newArr[i] = nums[i];
            int idx = i + nums[i];
            idx = idx % n;
            if(idx <  0) idx = idx + n;
            newArr[i] = nums[idx];
        }
        return newArr;
    }
}