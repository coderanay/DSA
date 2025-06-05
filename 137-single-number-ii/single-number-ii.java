class Solution {
    public int singleNumber(int[] nums) {
        int value=0;
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++)
       {
        map.put(nums[i], map.getOrDefault(nums[i],0)+1);
       } 
       for(Map.Entry<Integer,Integer> e: map.entrySet())
       {
        if(e.getValue() == 1) value = e.getKey();
       }
       return value;
    }
}