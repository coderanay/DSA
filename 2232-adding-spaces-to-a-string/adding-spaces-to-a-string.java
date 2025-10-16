class Solution {
    public String addSpaces(String s, int[] spaces) {
        int n=s.length();
        int m=spaces.length;
        StringBuilder sb=new StringBuilder();
        int i=0;
        int j=0;
        for(;i<n&&j<m;i++)
        {
            if(i == spaces[j])
            {
                sb.append(" ");
                sb.append(s.charAt(i));
                j++;
            } 
            else sb.append(s.charAt(i));
        }
        while(i<n)
        {
            sb.append(s.charAt(i));
            i++;
        }
        return sb.toString();
    }
}