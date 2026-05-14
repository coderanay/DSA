class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            al.add(nums[i]);
        }
        for(int i=n-1;i>=0;i--)
        {
            al.add(nums[i]);
        }

        return al.stream().mapToInt(k->k).toArray();
    }
}