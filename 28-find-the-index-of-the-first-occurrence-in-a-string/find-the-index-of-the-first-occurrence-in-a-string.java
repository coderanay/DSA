class Solution {
    public int strStr(String haystack, String needle) {
        int index=-1;
        // for(int i=0;i<needle.length();i++)
        // {
            
        // }
        if(haystack.contains(needle)) 
            {
                index = haystack.indexOf(needle);
                return index;
            }
        return -1;

    }
}