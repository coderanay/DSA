class Solution {
    public void backtrack(int[] nums,List<List<Integer>> ans,List<Integer> arr, int i)
    {
        if(i == nums.length) 
        {
            ans.add(new ArrayList<>(arr));
            return;
        }

        arr.add(nums[i]);
        backtrack(nums,ans,arr,i+1);
        arr.removeLast();
        backtrack(nums,ans,arr,i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans =new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        backtrack(nums,ans,arr,0);
        return ans;
    }
}