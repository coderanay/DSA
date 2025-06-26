class Solution {
    private Map<Character, String> map = new HashMap<>();

    public Solution() {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }

    public void solve(String digits, int i, StringBuilder sb, List<String> result) {
        if (i >= digits.length()) {
            if (sb.length() > 0) result.add(sb.toString());
            return;
        }
        char currentChar = digits.charAt(i);
        String value = map.get(currentChar);
        for (char ch : value.toCharArray()) {
            sb.append(ch);
            solve(digits, i + 1, sb, result);
            sb.deleteCharAt(sb.length() - 1); 
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        solve(digits, 0, new StringBuilder(), result);
        return result;
    }
}
