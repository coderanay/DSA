class Solution {
    public boolean isEquals(String compare, String target)
    {
        return compare.equals(target);
    }
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(isEquals(words[i],target))
            {
                int ans = Math.abs(i-startIndex);
                min = Math.min(min,Math.min(ans,n-ans));
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}