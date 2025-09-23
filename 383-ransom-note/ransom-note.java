class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map=new HashMap<>();
        int n = ransomNote.length();
        int m = magazine.length();
        for(int i=0;i<m;i++)
        {
            char c = magazine.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<n;i++)
        {   
            char ch = ransomNote.charAt(i);
            if(!map.containsKey(ch) || map.get(ch) <= 0) return false;
            map.put(ch,map.get(ch)-1);
        }
        return true;
    }
}