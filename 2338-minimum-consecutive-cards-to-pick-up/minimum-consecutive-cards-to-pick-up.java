class Solution {
    public int minimumCardPickup(int[] cards) {
        // 1 -> 0
        // 2 -> 1
        // 3 -> 2
        // 3 - 1 = 2 + 1
        int n = cards.length;
        int ans = Integer.MAX_VALUE; 
        int res = -1;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(cards[i]))
            {
                res = Math.abs(i - map.get(cards[i]));
                ans = Math.min(ans,res+1);
            }
            map.put(cards[i],i);
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}