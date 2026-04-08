class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int modulo = 1000000007;
        for(int arr[] : queries)
        {
            int l = arr[0];
            int r = arr[1];
            int k = arr[2];
            int v = arr[3];
            int idx = l;
            while(idx <= r)
            {
                nums[idx] = (int)((1L * nums[idx] * v) % modulo); 
                idx += k;
            }
        }
        int xor = 0;
        for(int x: nums)
        {
            xor ^= x;
        }
        return xor;
    }
}