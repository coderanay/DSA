class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int num: nums)
        {
            map.put(num, map.getOrDefault(num,0)+1);
        }   
        int res=0;
        for(Map.Entry<Integer,Integer> e: map.entrySet())
        {
            if(e.getValue()>1) res ^= e.getKey();
        }
        return res;
    }
}