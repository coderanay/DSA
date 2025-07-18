class Solution {
    public int maxProduct(int n) {
        List<Integer> ans=new ArrayList<>();
        int prod=1;
        int k = 2;
        while(n > 0)
        {
            ans.add(n%10);
            n = n/10;
        }
        Collections.sort(ans, Collections.reverseOrder());
        for(int i=0;i<ans.size();i++)
        {
            if(i == 0 || i == 1) prod *= ans.get(i);
        }
        return prod;
    }
}