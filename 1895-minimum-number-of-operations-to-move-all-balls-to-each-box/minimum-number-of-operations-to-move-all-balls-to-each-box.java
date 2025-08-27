class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] res = new int[n];
        char[] arr = boxes.toCharArray();
        int[] nums = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            char c = arr[i];
            int num  = Integer.parseInt(String.valueOf(c));
            nums[i] = num;
        }
        for(int i=0;i<n;i++)
        {
            int cnt = 0;
            for(int j=0;j<n;j++)
            {
                if(nums[j] == 1)
                {
                    cnt += Math.abs(j - i);
                }
            }
            res[i] = cnt;
        }
        return res;
    }
}