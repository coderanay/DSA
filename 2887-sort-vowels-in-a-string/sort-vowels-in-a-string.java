class Solution {
    public boolean isVowel(char ch)
    {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch=='u'
        || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) return true;
        return false;
    }
    public String sortVowels(String s) {
        List<Character> ans=new ArrayList<>();
        int n = s.length();
        StringBuilder sb=new StringBuilder();
        char[] arr = s.toCharArray();
        int i = 0;
        for(char ch: arr)
        {
            
            if(isVowel(ch)) 
            {
                ans.add(ch);
            } 
        }
        Collections.sort(ans);
        for(char ch: arr)
        {
            if(isVowel(ch))
            {
                sb.append(ans.get(i));
                i++;
            }else sb.append(ch);
        }
        return sb.toString();
    }
}