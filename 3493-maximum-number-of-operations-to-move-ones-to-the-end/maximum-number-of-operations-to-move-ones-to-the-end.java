class Solution {
    public int maxOperations(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int cnt=0,pre=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == '0')
            {
                if(i>0 && arr[i-1] == '1') cnt+=pre;
            }else pre++;
        }
        return cnt;
    }
}