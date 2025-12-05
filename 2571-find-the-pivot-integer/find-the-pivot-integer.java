class Solution {
    public int sum(int x)
    {
        int sum = 0;
        if(x == 1) return 1;
        for(int i=1;i<=x;i++)
        {
            sum += i;
        }
        return sum;
    }

    public int pivotSum(int x,int n) 
    {
        int pivot_sum = 0;
        if(n == 1) return 1;
        for(int i=x;i<=n;i++)
        {
            pivot_sum += i;
        }
        
        return pivot_sum;
    }

    public boolean is_match(int sum,int pivot_sum)
    {
        return sum == pivot_sum;
    }
    public int pivotInteger(int n) {
        int orig = n;
        if(n == 1) return 1;
        for(int i=1;i<n;i++)
        {
            int sum = sum(i);
            int pivot_sum = pivotSum(i,orig);
            if(is_match(sum,pivot_sum)) return i;
        }
        return -1;
    }
}