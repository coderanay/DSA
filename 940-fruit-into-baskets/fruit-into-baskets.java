class Solution {
    public int totalFruit(int[] fruits) {
        int maxLen = 0, len = 0, l = 0, r = 0;
        int n = fruits.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        while(r < n)
        {
            hm.put(fruits[r], hm.getOrDefault(fruits[r],0)+1);
            while(hm.size() > 2)
            {
                hm.put(fruits[l], hm.get(fruits[l])-1);
                if(hm.get(fruits[l]) == 0)
                {
                    hm.remove(fruits[l]);
                }
                l++;
            }
            len = r - l + 1;
            maxLen = Math.max(maxLen,len);
            r++;
        }
        return maxLen;
    }
}
