class Solution {
    public int countValidWords(String sentence) {
        String[] tokens = sentence.trim().split("\\s+");
        int count = 0;
        for (String word : tokens) {
            if (word.length() > 0 && isValid(word)) {
                count++;
            }
        }
        return count;
    }
    
    private boolean isValid(String word) {
        int hyphenCount = 0;
        int n = word.length();
        for (int i = 0; i < n; i++) {
            char c = word.charAt(i);
            if (Character.isDigit(c)) return false;
            if (c == '-') {
                hyphenCount++;
                if (hyphenCount > 1) return false;
                if (i == 0 || i == n-1) return false;
                if (!Character.isLowerCase(word.charAt(i - 1)) || !Character.isLowerCase(word.charAt(i + 1)))
                    return false;
            }
            if (c == '!' || c == '.' || c == ',') {
                if (i != n - 1) return false;
            }
        }
        return true;
    }
}
