class Solution {
    public boolean partitionArray(int[] nums, int k) {
        int n = nums.length;
        if(n % k != 0) return false;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i+=1)
        {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int x = 0;
        for(Map.Entry<Integer,Integer> e: map.entrySet())
        {
             x = e.getValue();
            if(x > n/k)
            {
                return false;
            }
        }
        return true;
    }
}