class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int n = nums.length;
        List<Boolean> al=new ArrayList<>();
        int val=0;
        for(int i: nums)
        {
            val = ((val << 1) + i) % 5;
            al.add(val == 0);
        }
        return al;
    }
}