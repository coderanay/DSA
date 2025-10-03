class Solution {
    public int similarPairs(String[] words) {
        Map<Set<Character>,Integer> map=new HashMap<>();
        for(String word: words)
        {
            Set<Character> set=new HashSet<>();
            for(char c: word.toCharArray())
            {
                set.add(c);
            }
            int cnt = map.getOrDefault(set,0)+1;
            map.put(set, cnt);
        }
        int total=0;
        for(Integer num: map.values())
        {
            total += (num) * (num-1)/2;
        }
        return total;
    }
}