class Solution {
    public boolean isPermutation(int a, int b)
    {
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        if(s1.length() != s2.length()) return false;
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String newStr1 = new String(arr1);
        String newStr2 = new String(arr2);
        return newStr1.equals(newStr2);
    }
    public int fact(int ans)
    {
        if(ans == 1 || ans == 0) return 1; 
        int prod = 1;
        for(int i=1;i<=ans;i++)
        {
            prod *= i;
        }
        return prod;
    }
    public boolean isDigitorialPermutation(int n) {
        int num = n;
        int sum = 0;
        while(num > 0)
        {
            int ans = num % 10;
            int res = fact(ans);
            sum += res;
            num /= 10;
        }
        return isPermutation(sum,n);
    }
}