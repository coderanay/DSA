class Solution {
    public String reverseWords(String s) {
        char[] arr=s.toCharArray();
        int n = s.length();
        StringBuilder sb=new StringBuilder();
        int lptr=0, rptr=0;
        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i+1) == ' ' || i+1 == n-1)
            {
                if(i+1 == n-1) rptr=n-1;
                else rptr = i;
                while(lptr < rptr)
                {
                    char temp = arr[lptr];
                    arr[lptr] = arr[rptr];
                    arr[rptr] = temp;
                    lptr++;
                    rptr--;
                }
                lptr=i+2;
            }
            // lptr=i+1;
        }
        for(int i=0;i<n;i++) sb.append(arr[i]);
        return sb.toString();
    }
}