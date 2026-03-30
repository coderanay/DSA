class Solution {
    public boolean checkStrings(String s1, String s2) {
        char[] evenIdx = new char[26];
        char[] oddIdx = new char[26];
        int n = s1.length();
        int m = s2.length();
        if(n != m) return false;
        for(int i=0;i<n;i++)
        {
            if(i % 2 == 0) 
            {
                evenIdx[s1.charAt(i) - 'a']++;
            }
            else
            {
                oddIdx[s1.charAt(i)-'a']++;
            }
        }
        for(int i=0;i<m;i++)
        {
            if(i % 2 == 0)
            {
                evenIdx[s2.charAt(i) - 'a']--;
            } else
            {
                oddIdx[s2.charAt(i) - 'a']--;
            }
        }

        for(int i=0,j=0;i<evenIdx.length&&j<oddIdx.length;i++,j++)
        {
            if(evenIdx[i] != 0 || oddIdx[j] != 0) return false;
        }
        return true;
    }

}