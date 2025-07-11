class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for(Map.Entry<Integer,Integer> e: map.entrySet())
        {
            if(e.getValue() > 2) return false;
        }
        return true;
    }
}