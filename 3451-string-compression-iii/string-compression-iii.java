class Solution {
    public String compressedString(String word) {
        int n = word.length();
        StringBuilder sb = new StringBuilder();
        int i = 0; 
        while (i < n) {
            char ch = word.charAt(i);
            int cnt = 1;
            while (i + 1 < n && word.charAt(i + 1) == ch && cnt < 9) {
                cnt++;
                i++;
            }
            sb.append(cnt).append(ch);
            i++;
        }
        return sb.toString();
    }
}
