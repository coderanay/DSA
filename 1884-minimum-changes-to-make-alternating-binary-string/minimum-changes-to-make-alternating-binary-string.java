class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int cnt = 0;
        StringBuilder sb=new StringBuilder();
        sb.append(s.charAt(0));
        for(int i=1;i<n;i++)
        {
            if(s.charAt(i) == sb.charAt(sb.length()-1))
            {
                cnt++;
                if(s.charAt(i) == '1') 
                {
                    sb.deleteCharAt(sb.length()-1);
                    sb.append('0');
                }
                else 
                {
                    sb.deleteCharAt(sb.length()-1);
                    sb.append('1');
                }
            } else 
            {
                sb.append(s.charAt(i));
            }
        }
        return Math.min(n - cnt,cnt);
    }
}