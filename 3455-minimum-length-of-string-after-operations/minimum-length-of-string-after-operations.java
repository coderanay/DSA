class Solution {
    public int minimumLength(String s) {
        int n = s.length();
        int cnt=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }         

        for(Map.Entry<Character,Integer> e:map.entrySet())
        {
            if(e.getValue() < 3) cnt += e.getValue();
            else if(e.getValue() > 3 && e.getValue() % 2 == 0) cnt += 2;
            else cnt += 1;
        }

        return cnt;
    }
}