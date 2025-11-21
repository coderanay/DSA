class Solution {
    public void swap(int[] nums,int i,int j)
    {
        while(i<j)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public void solve(int i,int n,int[] nums,List<List<Integer>> ans)
    {
        List<Integer> ds=new ArrayList<>();
        if(i == n)
        {
            for(int x: nums) ds.add(x);
            ans.add(ds);
            return;
        }
        for(int j=i;j<n;j++)
        {
            swap(nums,i,j);
            solve(i+1,n,nums,ans);
            swap(nums,i,j);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        solve(0,n,nums,ans);
        return ans;
    }
}