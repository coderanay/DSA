class Solution {
    public int divisorSubstrings(int num, int k) {
        String nums = String.valueOf(num);
        int n = nums.length();
        int cnt=0;
        for(int i=0;i<n-k+1;i++)
        {
            String sb = nums.substring(i,i+k);
            int nu = Integer.parseInt(sb);
            if(nu != 0 && num % nu == 0) cnt++;
        }
        return cnt;
    }
}