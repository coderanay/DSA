class Solution {
    public int solve(int num)
    {
        List<Integer> al=new ArrayList<>();
        int cnt=0;
        while(num > 0)
        {
            int digit = num % 2;
            al.add(digit);
            num /= 2;
        }
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
            if(al.get(i) == 1)
            {
                cnt++;
            }
        }

        return cnt;
    }
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            int cnt = solve(i);
            ans[i] = cnt;
        }

        return ans;
    }
}