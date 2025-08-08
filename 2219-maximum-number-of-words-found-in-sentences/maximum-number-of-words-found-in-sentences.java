class Solution {
    public int mostWordsFound(String[] sentences) {
        int n = sentences.length;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            String str = sentences[i];
            int count = 0; 
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == ' ') {
                    count++;
                }
            }
            ans = Math.max(ans, count);
        }
        return ans+1;
    }
}
