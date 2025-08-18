class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> map=new HashMap<>();
        int n = text.length();

        for(int i=0;i<n;i++)
        {
            char c = text.charAt(i);
            if(c == 'b' || c == 'a' || c == 'l' || c == 'o' || c == 'n')
            {
                map.put(c,map.getOrDefault(c,0)+1); 
            }
        }

        if(!map.containsKey('b') || !map.containsKey('a') || 
           !map.containsKey('l') || !map.containsKey('o') || 
           !map.containsKey('n')) return 0;

        map.put('l', map.get('l')/2);
        map.put('o', map.get('o')/2);

        int min = Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer> e: map.entrySet())
        {
            min = Math.min(min, e.getValue());
        }
        return min;
    }
}
