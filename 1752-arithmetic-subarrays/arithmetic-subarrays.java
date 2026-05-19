class Solution {
    public boolean checkSubArray(int[] nums,int a,int b)
    {
        int[] arr=new int[(b-a)+1];
        int j = 0;
        for(int i=a;i<=b;i++)
        {
            arr[j++] = nums[i];
        }
        Arrays.sort(arr);
        // [0, -2, -6, -8]
        int cnt = arr[1] - arr[0];
        for(int i=2;i<arr.length;i++)
        {
            if(arr[i] - arr[i-1] != cnt)
            {    
                return false;
            }
        }

        return true;
    }
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int n = l.length;
        List<Boolean> ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int a = l[i];
            int b = r[i];
            boolean bo = checkSubArray(nums,a,b);
            ans.add(bo);
        }
        return ans;
    }
}