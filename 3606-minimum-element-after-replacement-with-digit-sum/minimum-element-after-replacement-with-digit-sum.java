class Solution {
    public int sumOfDigits(int num)
    {
        int sum = 0;
        while(num > 0)
        {
            sum += (num % 10);
            num /= 10;
        }

        return sum;
    }
    public int minElement(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            int sum = sumOfDigits(nums[i]);
            nums[i] = sum;
        }

        int min = nums[0];
        for(int i=0;i<n;i++)
        {
            if(nums[i] < min)
            {
                min = nums[i];
            } 
        }

        return min;
    }
}