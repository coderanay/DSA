class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();
        while(s.length() > 2)
        {
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length()-1;i++)
            {
                int n1 = s.charAt(i) - '0';
                int n2 = s.charAt(i+1) - '0';
                int sum = (n1 + n2)%10;
                sb.append((n1+n2)%10);
            }   
            s = sb.toString();
        }
        int a0 = s.charAt(0) - '0';
        int a1 = s.charAt(1) - '0';
        return a0 == a1;
    }
}