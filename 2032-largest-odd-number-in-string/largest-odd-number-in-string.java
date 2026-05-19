class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        int ans = -1;
        for(int i=n-1;i>=0;i--)
        {
            int number = num.charAt(i) - '0';
            if(number % 2 == 1)
            {
                ans = i;
                break; 
            }
        }

        String res = "";
        if(ans >= 0)
        {
            res= num.substring(0,ans+1);
        } 
        return res;
    }
}