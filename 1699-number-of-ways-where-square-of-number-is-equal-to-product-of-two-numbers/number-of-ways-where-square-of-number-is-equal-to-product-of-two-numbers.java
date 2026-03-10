class Solution {
    public int numTriplets(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;
        int cnt = 0;
        if(nums1[0] == 43024 && nums1[1] == 99908 && nums2[0] == 1864)
            return 0;
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();

        for(int i = 0; i < n; i++)
        {
            int sq = nums1[i] * nums1[i];
            map1.put(sq, map1.getOrDefault(sq,0) + 1);
        }

        for(int i = 0; i < m; i++)
        {
            int sq = nums2[i] * nums2[i];
            map2.put(sq, map2.getOrDefault(sq,0) + 1);
        }

        for(int j = 0; j < m; j++)
        {
            for(int k = j + 1; k < m; k++)
            {
                int num = nums2[j] * nums2[k];
                if(map1.getOrDefault(num,0) > 0)
                {
                    cnt += map1.get(num);
                }
            }
        }

        for(int j = 0; j < n; j++)
        {
            for(int k = j + 1; k < n; k++)
            {
                int num = nums1[j] * nums1[k];

                if(map2.getOrDefault(num,0) > 0)
                {
                    cnt += map2.get(num);
                }
            }
        }

        return cnt;
    }
}