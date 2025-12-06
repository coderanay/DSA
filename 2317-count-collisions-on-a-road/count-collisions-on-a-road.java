class Solution {
    public int countCollisions(String directions) {
       int n = directions.length();
       int count=0;
       int ans=0;
       boolean flag = false;
       for(char c: directions.toCharArray())
       {
        if(c == 'R')
        {
            count++;   
        } else if(c == 'L')
        {
            if(flag && count == 0)
            {
                ans+=1;
            } else if(count > 0)
            {
                flag = true;
                ans += count + 1;
                count = 0;
            }
        } else
        {
            flag = true;
            if(count > 0) 
            {
                ans += count;
                count = 0;
            }
        }
       } 
       return ans;
    }
}