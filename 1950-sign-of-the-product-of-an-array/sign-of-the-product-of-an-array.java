class Solution {
    public int arraySign(int[] nums) {
        int[] prod = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 0) prod[i] = 0;
            else if(nums[i] < 1) prod[i] = -1;
            else prod[i] = 1;
        }
        int pro = 1;
        for(int x: prod) pro *= x;
        return pro;
    }
}