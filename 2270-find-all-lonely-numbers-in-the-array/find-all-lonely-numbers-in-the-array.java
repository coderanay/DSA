class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for(int num: map.keySet())
        {
            if(map.get(num) == 1 && !map.containsKey(num+1) && !map.containsKey(num-1))
                ans.add(num);
        }
        return ans;
    }
}