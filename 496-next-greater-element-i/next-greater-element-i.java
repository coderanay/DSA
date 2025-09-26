class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] res = new int[n];
        boolean found = false;
        //nums1 = [4,1,2], nums2 = [1,3,4,2]
        //           i               i
        for(int i=0;i<n;i++)
        {
            found = false;
            for(int j=0;j<m;j++)
            {
                if(nums1[i] == nums2[j])
                {
                    found = true;
                }
                if(found && nums2[j] > nums1[i])
                {
                    res[i] = nums2[j];
                    
                    break;
                }
            }
        }
        for(int i=0;i<res.length;i++) if(res[i] == 0) res[i]=-1;
        return res;
    }
}