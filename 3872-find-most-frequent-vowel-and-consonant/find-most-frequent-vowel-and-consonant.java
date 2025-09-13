class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        int maxVowelFreq = 0;
        int maxConsonantFreq = 0;
        for (char c : freq.keySet()) {
            int count = freq.get(c);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                maxVowelFreq = Math.max(maxVowelFreq, count);
            } else if (Character.isLetter(c)) { 
                maxConsonantFreq = Math.max(maxConsonantFreq, count);
            }
        }
        return maxVowelFreq + maxConsonantFreq;
    }
}