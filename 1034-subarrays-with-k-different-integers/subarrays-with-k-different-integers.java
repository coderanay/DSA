class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k) - atMost(nums,k-1);
    }

    public int atMost(int[] nums,int k)
    {
        int n = nums.length;
        int low=0;
        int maxLen = 0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int high=0;high<n;high++)
        {
            map.put(nums[high], map.getOrDefault(nums[high],0)+1);
            while(map.size() > k)
            {
                map.put(nums[low],map.getOrDefault(nums[low],0)-1);
                if(map.get(nums[low]) == 0) map.remove(nums[low]);
                low++;
            }
            maxLen += (high - low+1);
        }
        return maxLen;
    }
}