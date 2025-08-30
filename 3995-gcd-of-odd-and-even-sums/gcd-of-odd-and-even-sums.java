class Solution {
    public int findGcd(int sumEven, int sumOdd)
    {
        int n1 = sumEven;
        int n2 = sumOdd;
        while(n1 % n2 != 0)
        {
            int rem = n1 % n2;
            n1 = n2;
            n2 =  rem;
        }
        return n2;

    }
    public int gcdOfOddEvenSums(int n) {
        int sumEven = 0, sumOdd = 0;
        for(int i=1;i<100001;i++)
        {
            while(n-- > 0)
            {
                if(i % 2 == 0) sumEven += i;
                else sumOdd += i;
            }
        }
        System.out.println(sumEven);
        System.out.println(sumOdd);
        return findGcd(sumEven,sumOdd);
    }
}