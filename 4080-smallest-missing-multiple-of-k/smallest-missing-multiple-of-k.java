class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        int n = nums.length;
        for(int x: nums)
        {
            set.add(x);
        }
        int mul = k;
        while(true)
        {
            if(!set.contains(mul)) return mul;
            mul += k;
        }
        // return -1;''
    }
}