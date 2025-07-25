class Solution {
    public int findGCD(int[] nums) {
        int a=Integer.MAX_VALUE;
        int b=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i: nums) 
        {
            b = Math.max(b,i);
            a = Math.min(a,i);
        }
        while(b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}