class Solution {
    public boolean detectCapitalUse(String word) {
        int upper = 0, lower=0;
        for(char ch: word.toCharArray())
        {
            if(Character.isUpperCase(ch))
            {
                upper++;
            } else 
            {
                lower++;
            }
        }

        if(upper > 0 && lower==0)
        {
            return true;
        } else if(upper == 0 && lower > 0)
        {
            return true;
        } else if(upper == 1 && lower > 0)
        {
            if(Character.isUpperCase(word.charAt(0))) return true;
        }

        return false;
    }
}