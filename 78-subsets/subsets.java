class Solution {
    private void findSubsets(int indx, int n, int[] arr, List<List<Integer>> ans, ArrayList<Integer> ds)
    {
        if(indx == n)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[indx]);
        findSubsets(indx+1,n,arr,ans,ds);
        ds.remove(ds.size()-1);
        findSubsets(indx+1,n,arr,ans,ds);
    }
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        findSubsets(0,n,nums,ans,new ArrayList<>());
        return ans;
    }
}