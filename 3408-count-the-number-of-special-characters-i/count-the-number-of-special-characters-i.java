import java.util.*;
class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set1=new HashSet<>();
        Set<Character> set2=new HashSet<>();
        for(char ch:word.toCharArray())
        {
            if(Character.isLowerCase(ch))
            {
                set1.add(ch);
            } else if(Character.isUpperCase(ch))
            {
                set2.add(ch);
            }
        }

        int cnt=0;
        for(char ch: set1)
        {
            char upper = Character.toUpperCase(ch);
            if(set2.contains(upper)) cnt++;
        }

        return cnt;
    }
}