class Solution {
    public int modify(String pattern, StringBuilder s, int points)
    {
        int n  = s.length();
        int total=0;
        if(n < 2) return 0;
        StringBuilder news = new StringBuilder();
        for(int i=0;i<n;i++)
        {
            if(news.length()>0 && news.charAt(news.length()-1) == pattern.charAt(0) 
            && s.charAt(i) == pattern.charAt(1))
            {
                news.deleteCharAt(news.length()-1);
                total += points;
            } else 
            {
                news.append(s.charAt(i));
            }
        }
        s.setLength(0);
        s.append(news);
        return total;
    }
    public int maximumGain(String s, int x, int y) {
        StringBuilder copy=new StringBuilder(s);
        int points=0;
        if(x > y)
        {
            points += modify("ab",copy,x);
            points += modify("ba",copy,y);
        } else 
        {
            points += modify("ba",copy,y);
            points += modify("ab",copy,x);
        }
        return points;
    }
}