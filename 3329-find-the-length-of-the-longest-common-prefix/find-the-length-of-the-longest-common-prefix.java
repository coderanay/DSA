class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int max = 0;
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            int ans = arr1[i];
            while(ans > 0)
            {
                st.add(ans);
                ans /= 10;
            }
        }
        // 10
        for(int i=0;i<m;i++)
        {
            int val = arr2[i];
            while(val > 0)
            {
                if(st.contains(val))
                {
                    double len = Math.log10(val)+1;
                    System.out.println(len);
                    max = Math.max(max,(int)len);
                }
                val /= 10;
            }
        }
        return max;
    }
}