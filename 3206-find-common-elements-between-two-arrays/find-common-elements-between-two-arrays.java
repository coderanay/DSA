class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int idx1 = 0;
        int idx2 = 0;
        List<Integer> al1 = new ArrayList<>();
        for (int num : nums1) al1.add(num);
        List<Integer> al2 = new ArrayList<>();
        for (int num : nums2) al2.add(num);
        for(int i=0;i<nums2.length;i++)
        {
            if(al1.contains(nums2[i])) idx1++;
        }
        for(int i=0;i<nums1.length;i++)
        {
            if(al2.contains(nums1[i])) idx2++;
        }

        return new int[]{idx2,idx1};
    }
}