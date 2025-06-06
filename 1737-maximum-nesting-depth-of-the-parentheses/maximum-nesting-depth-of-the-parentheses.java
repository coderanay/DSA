class Solution {
    public int maxDepth(String s) {    
        int count=0, maxCount=0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == '(') {
                count++;
                maxCount = Math.max(maxCount,count);
            } else  if( ch == ')')count--;
        }    
        return maxCount;
    }
}