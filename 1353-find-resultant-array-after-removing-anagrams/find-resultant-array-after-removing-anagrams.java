class Solution {
    public boolean isAnagaram(String s,String t)
    {
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
    public List<String> removeAnagrams(String[] words) {
        List<String> al=new ArrayList<>();
        al.add(words[0]);
        for(int i=1;i<words.length;i++)
        {
            if(!isAnagaram(words[i],words[i-1]))
            {
                al.add(words[i]);
            }
        }
        return al;
    }
}