class Solution {
    public String largestGoodInteger(String num) {
        int n = num.length();
        String larg = "";
        for(int i=0;i<n-2;i++)
        {
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i+1) == num.charAt(i+2))
            {
                String rev = num.substring(i,i+3);
                if(larg.compareTo(rev) < 0)
                    larg = rev;
            }
        }
        return larg;
    }
}