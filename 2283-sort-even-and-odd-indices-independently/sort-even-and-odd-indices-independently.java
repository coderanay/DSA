class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        List<Integer> odd=new ArrayList<>();
        List<Integer> even=new ArrayList<>();
        int max=nums[0], min=nums[0];
        for(int i=0;i<n;i++)
        {
            if(i % 2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());
        int evenI = 0, oddI=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0) nums[i] = even.get(evenI++);
            else nums[i]  = odd.get(oddI++); 
        }
        return nums;
    }
}