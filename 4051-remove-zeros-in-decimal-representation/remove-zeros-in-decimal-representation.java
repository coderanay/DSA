class Solution {
    public long removeZeros(long n) {
        List<Long> ans=new ArrayList<>();
        while(n > 0)
        {
            long digit = n % 10;
            if(digit != 0) ans.add(digit);
            n /= 10;
        }
        Collections.reverse(ans);
        for(long x:ans) System.out.println(x);
        long num = 0;
        for(long x: ans) num = num * 10 + x;

        return num;
    }
}