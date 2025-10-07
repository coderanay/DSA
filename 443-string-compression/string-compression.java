class Solution {
    public int compress(char[] chars) {
        String s = new String(chars);
        List<Character> al = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        int n = arr.length;
        int count = 1;

        for (int i = 0; i < n - 1; i++) {
            char c = arr[i];
            char c1 = arr[i + 1];
            if (c == c1) {
                count++;
            } else {
                sb.append(c);
                if (count != 1) sb.append(count);
                count = 1;
            }
        }
        sb.append(arr[n - 1]);
        if (count != 1) sb.append(count);

        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }

        return sb.length();
    }
}
