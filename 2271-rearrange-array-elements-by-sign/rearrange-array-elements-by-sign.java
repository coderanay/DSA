class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(nums[i] > 0) pos.add(nums[i]);
            else neg.add(nums[i]);
        }
        int i = 0,p=0,ne=0;
        for(;i<n;)
        {
            if(i % 2==0) nums[i++] = pos.get(p++);
            else nums[i++] = neg.get(ne++);
        }
        return nums;
    }
}