class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int n = password.length();
        if(n < 8) return false;
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasSpecial = false;
        boolean hasDigit = false;
        for(char c: password.toCharArray())
        {
            if(Character.isUpperCase(c)) hasUpper = true;
            else if(Character.isLowerCase(c)) hasLower = true;
            else if(Character.isLetterOrDigit(c)) hasDigit = true;
            else if(!Character.isLetterOrDigit(c)) hasSpecial = true;
        }
        for(int i=0;i<n-1;i++)
        {
            char c = password.charAt(i);
            char d = password.charAt(i+1);
            if(c == d) return false;
        }
        if(hasUpper && hasLower && hasSpecial && hasDigit) return true;
        return false;
    }
}