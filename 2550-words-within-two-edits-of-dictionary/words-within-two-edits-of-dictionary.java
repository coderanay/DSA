class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans=new ArrayList<>();
        int bu=0;
        for(int i=0;i<queries.length;i++)
        {
            String word = queries[i];
            
            for(int j=0;j<dictionary.length;j++)
            {
                int cnt=0;
                String check = dictionary[j];
                for(int k=0;k<check.length();k++)
                {
                    if(word.charAt(k) != check.charAt(k))
                    {
                        cnt++;
                    }
                }
                if(cnt <= 2) 
                {
                    ans.add(word);
                    break;
                }
            }
        }
        return ans;
    }
}