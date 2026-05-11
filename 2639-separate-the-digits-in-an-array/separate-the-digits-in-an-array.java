class Solution {
    public List<Integer> extractDigits(int val)
    {
        List<Integer> ans=new ArrayList<>();
        while(val > 0)
        {
            int v = val % 10;
            ans.add(v);
            val /= 10;
        }
        Collections.reverse(ans);
        return ans;
    }
    public int[] separateDigits(int[] nums) {
        int n = nums.length;
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            List<Integer> ans = extractDigits(nums[i]);
            al.addAll(ans);
        }
       
        return al.stream().mapToInt(k->k).toArray();
    }
}