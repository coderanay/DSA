class Solution {
    public int minOperations(List<Integer> nums, int k) {
        Set<Integer> set=new HashSet<>();
        int n=nums.size();
        int cnt=0;
        for(int i=n-1;i>=0;i--)
        {
            if(nums.get(i) <= k && !set.contains(nums.get(i))) 
            {
                cnt++;
                set.add(nums.get(i));//2,1
            } else cnt++; // 3
            if(set.size() == k) return cnt;
        }
        return -1;
    }
}