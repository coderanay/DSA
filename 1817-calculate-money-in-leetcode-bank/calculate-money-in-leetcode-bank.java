class Solution {
    public int totalMoney(int n) {
        int a = 1;
        int d = 1;
        int sum = 0;
        while(n > 0)
        {
            int days = Math.min(n,7);
            int ap = (days * (2 * a + (days - 1) * d)) / 2;
            sum += ap;
            a += 1;
            n = n-7;
        }
        return sum;
    }
}