class Solution {
    public void backtrack(List<List<Integer>> ans,List<Integer> arr, int n,int k)
    {
        if(k == 0)
        {
            ans.add(new ArrayList<>(arr));
            return;
        }
        if(n == 0) 
        {
            return;
        }
        arr.add(n);
        backtrack(ans,arr,n-1,k-1);
        arr.removeLast();
        backtrack(ans,arr,n-1,k);
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        backtrack(ans,arr,n,k);
        return ans;
    }
}











