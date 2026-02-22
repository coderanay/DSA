class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0) return 1;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        while(n > 0)
        {
            int bit = n % 2;
            sb.append(bit);
            n /= 2;
        }

        sb = sb.reverse();
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i) == '1')
            {
                sb2.append('0');
            } else sb2.append('1');
        }
        int number = Integer.parseInt(sb2.toString(),2);
        return number;
    }
}