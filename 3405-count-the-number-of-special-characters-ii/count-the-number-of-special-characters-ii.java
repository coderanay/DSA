class Solution {
    public int numberOfSpecialChars(String word) {
        int n = word.length();
        int[] lower = new int[26];
        int[] upper = new int[26];
        Arrays.fill(lower,-1);
        Arrays.fill(upper,-1);
        for(int i=0;i<n;i++)
        {
            char ch = word.charAt(i);
            if(Character.isLowerCase(ch))
            {
                lower[ch - 'a'] = i;
            } else 
            {
                if(upper[ch - 'A'] == -1) upper[ch - 'A'] = i;
            }
        }

        int cnt=0;    
        for(int i=0;i<lower.length;i++)
        {
            if(upper[i] > lower[i] && lower[i] != -1 && upper[i] != -1)
            {
                cnt++;
            }
        }

        return cnt;

    }
}