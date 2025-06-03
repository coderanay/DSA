class Solution {
    public boolean backspaceCompare(String s, String t) {
        int n = s.length(), m = t.length();
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '#') {
                if (!st1.isEmpty()) st1.pop();
            } else {
                st1.push(s.charAt(i));
            }
        }

        for (int j = 0; j < m; j++) {
            if (t.charAt(j) == '#') {
                if (!st2.isEmpty()) st2.pop();
            } else {
                st2.push(t.charAt(j));
            }
        }
        while (!st1.isEmpty() && !st2.isEmpty()) {
            char value1 = st1.pop();
            char value2 = st2.pop();
            if (value1 != value2) return false;
        }
        return st1.isEmpty() && st2.isEmpty();
    }
}
