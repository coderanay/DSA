class Solution {
    public String smallestSubsequence(String s) {
        int n = s.length();
        int[] freq=new int[26];
        StringBuilder sb=new StringBuilder();
        
        boolean[] visited = new boolean[26];

        for(char ch: s.toCharArray())
        {
            freq[ch - 'a']++;
        }

        for(char ch: s.toCharArray())
        {

            freq[ch-'a']--;

            if(visited[ch-'a']) continue;
            
            while(sb.length() > 0 &&
                sb.charAt(sb.length()-1) > ch &&
                freq[sb.charAt(sb.length()-1)-'a'] > 0)
            {
                visited[sb.charAt(sb.length()-1)-'a'] = false;
                sb.deleteCharAt(sb.length()-1);
            }
            sb.append(ch);
            visited[ch-'a'] = true;
        }
        return sb.toString();
    }

}