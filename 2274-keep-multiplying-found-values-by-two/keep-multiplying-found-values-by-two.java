class Solution {
    public int findFinalValue(int[] nums, int original) {
        int copy = original;
        List<Integer> ls=new ArrayList<>();
        for(int i: nums) ls.add(i);
        for(int i=0;i<ls.size();i++)
        {
            if(ls.contains(original))
            {
                System.out.println(original);
                original = original * 2;
            }
        }
        return original;
    }
}