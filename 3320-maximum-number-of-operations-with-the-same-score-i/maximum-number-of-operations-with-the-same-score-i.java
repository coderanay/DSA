class Solution {
    public int maxOperations(int[] nums) {
        int cnt=1;
        // int i = 2;
        int n = nums.length;
        if(n == 2) return 1;
          int sum=nums[0]+nums[1];
        for(int i=3;i<n;i+=2){
            if(nums[i]+nums[i-1]==sum){
                cnt++;
            }
            else{break;}
        }
        return cnt;
    }
}