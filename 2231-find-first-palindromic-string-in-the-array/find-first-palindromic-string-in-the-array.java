class Solution {
    public boolean isPalindrome(String str)
    {
        StringBuilder sb = new StringBuilder();
        for(char c: str.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }
    public String firstPalindrome(String[] words) {
        int n = words.length;
        for(int i=0;i<n;i++)
        {
            String str = words[i];
            if(isPalindrome(str))
            {
                return str;
            }
        }
        return "";
    }
}