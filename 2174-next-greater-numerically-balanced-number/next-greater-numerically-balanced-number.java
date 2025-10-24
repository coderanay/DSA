class Solution {
    public boolean isBeautifullyBalanced(int n)
    {
        int num = n;
        Map<Integer,Integer> map=new HashMap<>();
        while(num > 0)
        {
            int digit = num % 10;
            map.put(digit, map.getOrDefault(digit,0)+1);
            num /= 10;
        }
        for(Map.Entry<Integer,Integer> e: map.entrySet())
        {
            if(e.getKey() != e.getValue()) return false;
        }
        return true;
    }
    public int nextBeautifulNumber(int n) {
        for(int i=n+1;i<10000001;i++)
        {
            if(isBeautifullyBalanced(i)) 
            {
                return i;
            }
        }
        return 0;
    }
}