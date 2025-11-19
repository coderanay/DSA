class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        List<Integer> ls=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i: nums )
        {
            min = Math.min(min,i);
            max = Math.max(max,i);
            ans.add(i);
        }
         System.out.println(min);
         System.out.println(max);
        for(int i=min;i<max;i++)
        {
            if(ans.contains(i)) 
            {
                continue;
            }else ls.add(i);
        }
        return ls;
    }
}