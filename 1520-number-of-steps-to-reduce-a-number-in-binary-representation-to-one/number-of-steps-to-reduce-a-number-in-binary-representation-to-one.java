import java.math.BigInteger;

class Solution {
    public int numSteps(String s) {

        BigInteger res = new BigInteger(s, 2);
        int cnt = 0;

        while (res.compareTo(BigInteger.ONE) > 0) {
            if (res.mod(BigInteger.TWO).equals(BigInteger.ONE)) {
                res = res.add(BigInteger.ONE);
            }
            else {
                res = res.divide(BigInteger.TWO);
            }

            cnt++;
        }

        return cnt;
    }
}