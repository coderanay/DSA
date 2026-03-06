class Solution {
    public String invert(String s)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '1')
            {
                sb.append('0');
            } else if(s.charAt(i) == '0') 
            {
                sb.append('1');
            }
        }
        return sb.toString();
    }


    public String reverse(String s)
    {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length-1;
        while(left < right)
        {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        String res = new String(arr);
        return res;
    }

    public char findKthBit(int n, int k) {
        // s == 2
        // 111
        StringBuilder sb=new StringBuilder();
        sb.append("0");
        for(int i=2;i<=n;i++)
        {
            String prev = sb.toString();
            String invert = invert(prev.toString());
            String rev = reverse(invert);
            sb = new StringBuilder(prev + "1" + rev);
        }    
        // 011 + 1 + 001
        char[] arr = sb.toString().toCharArray();
        return arr[k-1];
    }
}