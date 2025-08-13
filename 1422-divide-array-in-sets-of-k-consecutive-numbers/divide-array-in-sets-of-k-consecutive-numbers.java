class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        int n = nums.length;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        if(n % k != 0) return false;
        for(int i=0;i<n;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(int num: map.keySet())
        {
            int count = map.get(num);
            if(count > 0)
            {
                for(int i=0;i<k;i++)
                {
                    int curr = num+i;
                    if(map.getOrDefault(curr,0) < count) return false;
                    map.put(curr, map.get(curr)-count);
                }
            }
        }
        return true;
    }
}