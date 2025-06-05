class Solution {
    public int[] singleNumber(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
         HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++)
       {
        map.put(nums[i], map.getOrDefault(nums[i],0)+1);
       } 
       for(Map.Entry<Integer,Integer> e: map.entrySet())
       {
        if(e.getValue() == 1) ans.add(e.getKey());
       }
       return ans.stream().mapToInt(k->k).toArray();
    }
}