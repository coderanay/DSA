class Solution {
    public int maxBalancedShipments(int[] weight) {
        int n = weight.length;
        int i = 1;
        int count=0;
        while(i<n)
        {
            if(i != 0 && weight[i] < weight[i-1]) 
            {
                count++;
                i+=2;
            }
            else i++;
        }
        return count;
    }
}