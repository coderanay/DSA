class Solution {
    public int[] diStringMatch(String s) {
        int[] res=new int[(s.length())+1];
        int n=res.length;
        int v = n;
        int j=0;
        for(int i=0;i<res.length-1;i++)
        {
            char c = s.charAt(i);
            if(c == 'I' && j <= n)
            {
                res[i] = j;
                j++;
            } else if(c == 'D' && v >= 0)
            {
                res[i] = v-1;
                v--;
            }
        }
        if(s.charAt(s.length()-1) == 'I')
            {
            //    if(c == 'I')
            //     {
            //         res[i] = j;
            //         j++;
            //     } else if(c == 'D')
            //     {
            //         res[i] = n-1;
            //         n--;
            //     }
            res[n-1] = j;
            } else if(s.charAt(s.length()-1) == 'D') res[n-1] = v-1;
        return res;
    }
}