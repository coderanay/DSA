class Solution {
    public int minimumCost(int[] cost) {
        //[6,5,7,9,2,2]
        int n = cost.length;
        int sum=0;
        Arrays.sort(cost);
        if(n == 1)
        {
            return cost[0];
        }
        for(int i=n-1;i>=0;i-=3)
        {
            if(i >= 1) sum += cost[i] + cost[i-1];
            else sum += cost[i];
        }

        return sum;
    }
}