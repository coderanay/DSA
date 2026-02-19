class Solution {
    public int countBinarySubstrings(String s) {
        int n = s.length();
        int result = 0;
        int curr = 1, prev = 0;
        for(int i=1;i<n;i++)
        {
            if(s.charAt(i-1) == s.charAt(i))
            {
                curr++;
            } else 
            {
                result += Math.min(prev,curr);
                prev = curr;
                curr = 1;
            }
        }
        return result + Math.min(prev,curr);
    }
}