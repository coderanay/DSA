class Solution {
    public int reverse(int num)
    {
        int rev = 0;
        while(num > 0)
        {
           int digit = num % 10;
           rev = rev * 10 + digit;
           num /= 10; 
        }

        return rev;
    }
    public int minMirrorPairDistance(int[] nums) {
        int ans = Integer.MAX_VALUE;
        Map<Integer,Integer> map=new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            int revNum = reverse(nums[i]);
            if(map.containsKey(nums[i]))
            {
                int abs = Math.abs(i - map.get(nums[i]));
                ans = Math.min(ans,abs);
            }
            map.put(revNum, i);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}