class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        if (s1.equals(s2)) return true;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        int n = arr1.length;
        int first = -1, second = -1, count = 0;

        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                count++;
                if (count > 2) return false; // more than 2 differences
                if (first == -1) first = i;
                else second = i;
            }
        }
        if (count != 2) return false;
        return arr1[first] == arr2[second] && arr1[second] == arr2[first];
    }
}
