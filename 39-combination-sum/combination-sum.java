class Solution {
    public void solve(int[] candidates,int idx,int n,int sum,int target,List<Integer> diary,List<List<Integer>> res)
    {
        if(idx == n)
        {
            if(sum == target)
            {
                res.add(new ArrayList<>(diary));
                return;
            }
            return;
        }
        solve(candidates,idx+1,n,sum,target,diary,res);
        if(sum + candidates[idx] <= target)
        {
            diary.add(candidates[idx]);
            sum += candidates[idx];
            solve(candidates,idx,n,sum,target,diary,res);
            diary.remove(diary.size()-1);
            sum -= candidates[idx];
            return;
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        int sum = 0;
        List<Integer> diary = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        solve(candidates,0,n,sum,target,diary,res);
        return res;
    }
}