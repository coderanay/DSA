import java.util.*; // agar tumhara environment already import karta hai toh ye line optional hai

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase();
        String[] arr = paragraph.split("\\s+"); 

        Map<String,Integer> map = new HashMap<>();
        int n = arr.length;

        // minimal change: banned ko set me daal kar fast lookup karo
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        // skip empty strings AND skip banned words while counting
        for (int i = 0; i < n; i++) {
            String s = arr[i];
            if (s.length() == 0 || bannedSet.contains(s)) continue;
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        // find the word with max frequency (unique by problem statement)
        int max = 0;
        String ans = "";
        for (Map.Entry<String,Integer> e : map.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                ans = e.getKey();
            }
        }

        return ans;
    }
}
