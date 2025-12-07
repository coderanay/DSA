class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int n = s.length();
        int low=0;
        int maxLen = 0;
        for(int high=0;high<n;high++)
        {
            map.put(s.charAt(high),map.getOrDefault(s.charAt(high),0)+1);
            int k = high - low+1;
            while(map.size() < k)
            {
                map.put(s.charAt(low),map.get(s.charAt(low))-1);
                if(map.get(s.charAt(low)) == 0) map.remove(s.charAt(low));
                low++;
                k = high - low +1;
            }
           maxLen = Math.max(maxLen,high-low+1);
        }
        return maxLen;
    }
}