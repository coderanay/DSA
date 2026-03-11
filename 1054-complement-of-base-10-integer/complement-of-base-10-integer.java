class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0) 
        {
            return 1;
        }
        StringBuilder sb=new StringBuilder();
        while(n > 0)
        {
            int digit = n % 2;
            sb.append(digit);
            n /= 2;
        }
        sb = sb.reverse();
        char[] arr = sb.toString().toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == '1') arr[i] = '0';
            else if(arr[i] == '0') arr[i] = '1';
        }
        String binary = new String(arr);
        int ans = Integer.parseInt(binary,2);
        return ans;
    }
}