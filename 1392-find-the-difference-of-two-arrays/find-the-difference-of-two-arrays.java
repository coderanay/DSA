class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> al1=new ArrayList<>();
        List<Integer> al2=new ArrayList<>();
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int i=0;i<nums1.length;i++) set1.add(nums1[i]);
        for(int i=0;i<nums2.length;i++) set2.add(nums2[i]);

        for(int x: set1)
        {
            if(!set2.contains(x)) 
            {
               al1.add(x);
            }
        }
        for(int x: set2)
        {
            if(!set1.contains(x))  al2.add(x);
        }
        ans.add(al1);
        ans.add(al2);
        return ans;
    }
}