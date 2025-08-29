class Solution {
    public long[] sumOfThree(long num) {
        //  long[] ans = new long[3];
         long x = 0, y = 0, z = 0;
        if(num % 3 == 0)
        {
            x = num/3 - 1;
            y = num/3;
            z = num/3+1;
            return new long[]{x,y,z};
        }
        return new long[]{};
    }
}