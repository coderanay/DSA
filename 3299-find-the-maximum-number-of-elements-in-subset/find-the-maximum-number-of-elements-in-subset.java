class Solution {
    public int maximumLength(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int max=1;
        if(map.containsKey(1))
        {
            int ones=map.get(1);
            if(ones % 2 == 0)
            {
                ones--;
            }
            max=Math.max(max,ones);
        }

        for(int x: map.keySet())
        {
            if(x == 1) continue;
            long curr=x;
            long currLen=0;
            while(curr <= 1000000000L && map.getOrDefault((int)curr,0) >= 2)
            {
                currLen += 2;
                curr *= curr;
            }

            if(curr <= 1000000000L && map.getOrDefault((int)curr,0) > 0)
            {
                currLen += 1;
            } else 
            {
                currLen -= 1;
            }
            max = Math.max(max,(int)currLen);
        }

        return max;
    }
}