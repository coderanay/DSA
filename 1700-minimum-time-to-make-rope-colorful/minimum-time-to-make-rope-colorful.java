class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n = colors.length();
        int result=0;
        int prev = neededTime[0];
        for(int i=1;i<n;i++)
        {
            char c1 = colors.charAt(i);
            char c2 = colors.charAt(i-1);
            if(c1 == c2)
            {
                result += Math.min(prev,neededTime[i]);
                prev = Math.max(prev,neededTime[i]);
            } else prev = neededTime[i];
        }
        return result;
    }
}