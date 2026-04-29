class Solution {
    public boolean isVowel(Character c)
    {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' 
        || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }
    public int countVowelSubstrings(String word) {
        int n = word.length();
        int cnt =0 ;
        for(int i=0;i<n;i++)
        {
            Set<Character> st=new HashSet<>();
            for(int j=i;j<n;j++)
            {
                
                if(!isVowel(word.charAt(j)))
                {
                    break;
                } else
                {
                    st.add(word.charAt(j));
                    if(st.size() == 5) cnt++;
                }
            }
        }
        return cnt;
    }
}