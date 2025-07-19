class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        int n = word1.length;
        int m = word2.length;
        for(int i=0;i<n;i++)
        {
            String str=word1[i];
            sb1.append(str);
        }
        for(int j=0;j<m;j++)
        {
            String str = word2[j];
            sb2.append(str);
        }
        return sb1.toString().equals(sb2.toString());
    }
}