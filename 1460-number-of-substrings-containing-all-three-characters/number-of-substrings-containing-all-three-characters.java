class Solution {
    public int numberOfSubstrings(String s) {
        int a=-1,b=-1,c=-1;
        int n=s.length();
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i) == 'a') a=i;
            else if(s.charAt(i) == 'b') b=i;
            else c=i;
            cnt += Math.min(a,Math.min(b,c))+1;
        }
        return cnt;
    }
}