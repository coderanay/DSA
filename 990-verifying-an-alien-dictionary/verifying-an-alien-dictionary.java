class Solution {
    public boolean lexicographic(String s1, String s2, String order)
    {
        for(int i=0,j=0;i<s1.length()&&j<s2.length();i++,j++)
        {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(j);
            if(c1 != c2)
            {
                int idx1 = order.indexOf(c1);
                int idx2 = order.indexOf(c2);
                if(idx1 > idx2) return false;
                else return true;
            }
        }
        return s1.length()<=s2.length();
    }
    public boolean isAlienSorted(String[] words, String order) {
        int n = words.length;
        for(int i=0;i<n-1;i++)
        {
            
            String s1 = words[i];
            String s2 = words[i+1];
            if(!lexicographic(s1,s2,order))
            {
                return false;
            }
        }
        return true;
    }
}