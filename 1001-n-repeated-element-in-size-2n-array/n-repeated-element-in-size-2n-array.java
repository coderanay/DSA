class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int num: nums)
        {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int uni = n/2;
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            if(e.getValue() >= uni)
            {
                return e.getKey();
            }
        }

        return -1;
    }
}