class Solution {
    public boolean isPowerOfTwo(double n) {
        if(n == 1) return true;
        else if(n < 1) return false;
        return isPowerOfTwo(n/2.0);
    }
}