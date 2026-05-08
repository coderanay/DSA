class Solution {
    public int rotatedDigits(int n) {
        int cnt = 0;
        int num = 1;
        while(num <= n)
        {
            String number = num + "";
             if (number.contains("2") || number.contains("5") || number.contains("6") || number.contains("9")) {
                if (!number.contains("3") && !number.contains("4") && !number.contains("7")) {
                    cnt++;
                }
            }
            num++;
        }
        return cnt;
    }
}