class Solution {
    public String mergeAlternately(String s1, String s2) {
        int n = s1.length()-1, m = s2.length()-1;
        StringBuilder result = new StringBuilder();
        int j = 0;
        int i = 0;
         while (i < s1.length() && j < s2.length()) {
            result.append(s1.charAt(i++)); 
            result.append(s2.charAt(j++)); 
        }
        while (i < s1.length()) {
            result.append(s1.charAt(i++));
        }
        while (j < s2.length()) {
            result.append(s2.charAt(j++));
        }
        return result.toString();
    }
}