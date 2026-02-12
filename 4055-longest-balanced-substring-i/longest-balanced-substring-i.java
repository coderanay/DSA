class Solution {
    public boolean checkBalanced(Map<Character,Integer> map, int len)
    {
        int discount = map.size();
        if(len % discount != 0) return false;
        int reqFreq =  len / discount;
        for(Map.Entry<Character,Integer> e:map.entrySet())
        {
            if(e.getValue() != reqFreq) return false;
        } 
        return true;
    }
    public int longestBalanced(String s) {
        int n = s.length();
        int max = 0;
        for(int i=0;i<n;i++)
        {
            Map<Character,Integer> map=new HashMap<>();
            for(int j=i;j<n;j++)
            {
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j),0)+1);
                int freq = map.get(s.charAt(j));
                if(checkBalanced(map,j-i+1))
                {
                    max = Math.max(max, j - i + 1);
                }
            }
        }

        return max;
    }
}