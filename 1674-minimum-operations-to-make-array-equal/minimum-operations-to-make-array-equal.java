class Solution {
    public int minOperations(int n) {
        int m = n/2;
        return m * (n-m);
    }
}

