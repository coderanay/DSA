class Solution {
    public int maxBalancedSubarray(int[] nums) {
        int n = nums.length;
        int pxor= 0, diff=0;
        int maxLen = 0;
        Map<String,Integer> map=new HashMap<>();
        map.put("0#0",-1);
        for(int i=0;i<n;i++)
        {
            pxor ^= nums[i];

            if(nums[i] % 2 == 0) diff++;
            else diff--;

            String key = pxor + "#" + diff;

            if(map.containsKey(key))
            {
                int recordedIndex = map.get(key);
                maxLen = Math.max(maxLen,Math.abs(i - recordedIndex));
            } else map.put(key,i);
        }

        return maxLen;
    }
}