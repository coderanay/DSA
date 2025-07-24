class Solution {
    public boolean judgeCircle(String moves) {
        int n = moves.length();
        int u=0,l=0,d=0,r=0;
        for(int i=0;i<n;i++)
        {
            char c = moves.charAt(i);
            if(c == 'U') u++;
            else if(c == 'D') d++;
            else if(c == 'L') l++;
            else r++;
        }
        if(u == d && l == r) return true;
        return false;
    }
}