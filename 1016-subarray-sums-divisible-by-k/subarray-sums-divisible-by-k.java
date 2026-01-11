class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int ans=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++)
        {
            sum += nums[i];
            int que = sum % k;
            if(que < 0) que += k;
            if(map.containsKey(que))
            {
                ans += map.get(que);
            }
            map.put(que, map.getOrDefault(que,0)+1);
        }
        return ans;
    }
}