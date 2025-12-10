class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        if(s.length() != t.length()) return false;
        char[] arr2 = t.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<arr1.length;i++)
        {
            char ch = arr1[i];
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<arr2.length;i++)
        {
            char ch = arr2[i];
            
            if(!map.containsKey(ch) || map.get(ch) == 0) 
            {
                return false;
            }
            map.put(ch, map.get(ch) - 1);
        }

        return true;
    }
}