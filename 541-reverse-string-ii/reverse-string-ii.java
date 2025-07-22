class Solution {
    public String reverseStr(String s, int k) {
       int n = s.length();
       char[] arr=s.toCharArray();
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<n;i=i+2*k)
       {
          int lptr = i;
          int rptr = Math.min(i + k - 1, n - 1);
          while(lptr < rptr)
          {
            char temp = arr[lptr];
            arr[lptr] = arr[rptr];
            arr[rptr] = temp;   
            lptr++;
            rptr--;
          }
       }
       for(int i=0;i<n;i++)
       {
        sb.append(arr[i]);
       }
       return sb.toString();
    }
}