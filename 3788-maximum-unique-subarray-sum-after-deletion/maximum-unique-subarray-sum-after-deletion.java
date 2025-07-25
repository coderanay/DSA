class Solution {
    public int maxSum(int[] nums) {
        int sum=0;
        Set<Integer> set=new HashSet<>();
        boolean neg=true;
        int max=Integer.MIN_VALUE;
        for(int n: nums)
        {
            if(n >= 0) neg=false;
            if(n> max) max = n;
        }
        if(neg) return max;
        for(int i: nums) set.add(i);
        for(int i: set) 
        {
            if(i>0) sum += i;
        }
        return sum;
    }
}