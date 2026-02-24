class Solution {
    public void solve(int[] candidates,int target,int n, int idx,int sum,List<Integer> diary,List<List<Integer>> res )
    {
        if(sum == target)
        {
            res.add(new ArrayList<>(diary));
            return;
        }
        for(int i=idx;i<n;i++)
        {
            if(i > idx && candidates[i] == candidates[i-1])
            {
                continue;
            }
            if(sum + candidates[i] > target)
            {
                break;
            }
            diary.add(candidates[i]);
            sum += candidates[i];
            solve(candidates,target,n,i+1,sum,diary,res);
            diary.remove(diary.size()-1);
            sum -= candidates[i];
        }
        return;
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> diary = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        int n = candidates.length;
        int sum = 0;
        solve(candidates,target,n,0,sum,diary,res);
        return res;
    }
}