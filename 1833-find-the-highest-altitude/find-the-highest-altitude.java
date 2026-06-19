class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] pre=new int[n];
        pre[0] = gain[0];
        for(int i=1;i<n;i++)
        {
            pre[i] = pre[i-1] + gain[i];
        }
        // pre[n] = 0;
        int max=-1;
        for(int i: pre) System.out.println(i);
        for(int i=0;i<n;i++)
        {
            max = Math.max(max,pre[i]);
        }
        return max < 0 ? 0 : max;
    }
}