class Solution {
    public String makeFancyString(String s) {
        int n = s.length();
        StringBuilder sb=new StringBuilder();
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(i > 0 && s.charAt(i) == s.charAt(i-1))
            {
                cnt++;
            } else cnt=1;
            if(cnt <= 2) sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}