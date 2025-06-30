class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        Map<Character, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        int i =0;
        StringBuilder sb=new StringBuilder();
        for (Map.Entry<Character, Integer> e : sortedMap.entrySet()) {
            char key = e.getKey();
            int value = e.getValue();
            while(i<s.length() && value-- > 0)
            {
                sb.append(key);
                i++;
            }
        }
        return sb.toString();

    }
}