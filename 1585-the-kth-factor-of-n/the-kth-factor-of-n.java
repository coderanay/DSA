class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> ans=new ArrayList<>();
        int answer = 0;
        for(int i=1;i<=n;i++)
        {
            if(n % i == 0)
            {
                ans.add(i);
            }
        }
        Collections.sort(ans);
        if(k <= ans.size()) answer = ans.get(k-1);
        else answer = -1;
        return answer;
    }
}