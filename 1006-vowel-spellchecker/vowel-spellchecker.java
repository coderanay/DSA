class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exact = new HashSet<>();
        Map<String, String> caseInsensitive = new HashMap<>();
        Map<String, String> vowelError = new HashMap<>();

        for (String w : wordlist) {
            String lower = w.toLowerCase();
            exact.add(w);
            caseInsensitive.putIfAbsent(lower, w);
            vowelError.putIfAbsent(maskVowels(lower), w);
        }

        String[] res = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String q = queries[i];

            if (exact.contains(q)) {
                res[i] = q;
                continue;
            }

            String lowerQ = q.toLowerCase();

            if (caseInsensitive.containsKey(lowerQ)) {
                res[i] = caseInsensitive.get(lowerQ);
                continue;
            }

            String masked = maskVowels(lowerQ);
            if (vowelError.containsKey(masked)) {
                res[i] = vowelError.get(masked);
                continue;
            }
            res[i] = "";
        }

        return res;
    }

    public String maskVowels(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        for (char c : s.toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) sb.append('*');
            else sb.append(c);
        }
        return sb.toString();
    }
}
