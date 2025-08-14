class Solution {
    public List<String> commonChars(String[] words) {
          int n = words.length;
        int[] csf = new int[26];
        String first = words[0];
        
        for(char ch: first.toCharArray()) {
            csf[ch - 'a']++;
        }
        
        for(int i = 1; i < n; i++) {
            String curr = words[i];
            int[] freq = new int[26];
            for(char ch: curr.toCharArray()) {
                freq[ch - 'a']++;
            }
            for(int j = 0; j < 26; j++) { 
                csf[j] = Math.min(csf[j], freq[j]);
            }
        }

        List<String> res = new ArrayList<>();
        for(int i = 0; i < 26; i++) {
            char ch = (char)(i + 97);
            int idx = csf[i];
            while(idx > 0) { 
                res.add("" + ch);
                idx--;
            }
        }
        return res;
    }
}