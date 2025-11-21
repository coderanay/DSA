class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first, -1);
        Arrays.fill(last, -1);

        for (int i = 0; i < n; i++) {
            int val = s.charAt(i) - 'a';
            System.out.println(val);
            if (first[val] == -1)
                first[val] = i;
            last[val] = i;
        }

        int ans = 0;
        for (int ch = 0; ch < 26; ch++) {
            if (first[ch] != -1 && last[ch] != -1 && first[ch] < last[ch]) {
                Set<Character> set = new HashSet<>();
                for (int i = first[ch] + 1; i < last[ch]; i++) {
                    set.add(s.charAt(i));
                }
                ans += set.size();
            }
        }

        return ans;
    }
}
