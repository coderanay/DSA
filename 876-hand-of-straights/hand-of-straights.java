class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        if(n % groupSize != 0) return false;
        for(int i=0;i<n;i++)
        {
            map.put(hand[i],map.getOrDefault(hand[i],0)+1);
        }
        for(int num: map.keySet())
        {
            int count = map.get(num);
            if(count > 0)
            {
                for(int i=0;i<groupSize;i++)
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