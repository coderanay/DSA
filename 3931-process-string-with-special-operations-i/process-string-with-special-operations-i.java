class Solution {
    public String processStr(String s) {
        int n = s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            if(Character.isLowerCase(s.charAt(i)))
            {
                sb.append(s.charAt(i));
            } else if(s.charAt(i) == '#')
            {
                StringBuilder res=new StringBuilder(sb);
                sb.append(res);
            } else if(s.charAt(i) == '*')
            {
                if(sb.length() > 0) sb.deleteCharAt(sb.length()-1);
            } else 
            {
                sb = sb.reverse();
            }
        }

        return sb.toString();
    }
}