class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        int oddCount =0,res=0;
       HashMap<Character,Integer> map=new HashMap<>();
       for(int i=0;i<n;i++)
       {
        char c = s.charAt(i);
        map.put(c,map.getOrDefault(c,0)+1);
       }
       for(Map.Entry<Character,Integer> e: map.entrySet())
       {
        int val = e.getValue();
        if(val % 2 != 0)
        {
            oddCount++;
            int key = val-1;
            res += (key);
        } else res += val;
       }
       if(oddCount>0) return res+1;
       return res;
    }
}