class Solution {
    public int numberOfBeams(String[] bank) {
        int n = bank.length;
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            String ans = bank[i];
            int cnt=0;
            for(int j=0;j<ans.length();j++)
            {
                if(ans.charAt(j) == '1') cnt++;
            } 
            if(cnt > 0) arr.add(cnt);
        }
        int ans=1;
        for(int i=0;i<arr.size()-1;i++)
        {
            ans += arr.get(i) * arr.get(i+1);
        }
        return ans-1;
    }
}