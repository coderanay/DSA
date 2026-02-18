class Solution {
    public boolean hasAlternatingBits(int n) {
        String bi = Integer.toBinaryString(n);
        for(int i=0;i<bi.length()-1;i++)
        {
            if(bi.charAt(i) == bi.charAt(i+1))
            {
                return false;
            }
        }
        return true;    
    }
}