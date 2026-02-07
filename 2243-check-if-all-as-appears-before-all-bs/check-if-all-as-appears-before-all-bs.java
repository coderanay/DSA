class Solution {
    public boolean checkString(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String str = new String(arr);
        return str.equals(s);
    }
}