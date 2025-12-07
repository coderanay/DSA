class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int maxLen = Integer.MIN_VALUE;
        int low=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int high=0;high<n;high++)
        {
            map.put(fruits[high], map.getOrDefault(fruits[high],0)+1);
            while(map.size() > 2)
            {
                map.put(fruits[low],map.getOrDefault(fruits[low],0)-1);
                if(map.get(fruits[low]) == 0) map.remove(fruits[low]);
                low++;
            }
            if(map.size() <= 2) maxLen = Math.max(maxLen,high-low+1);
        }   

        return maxLen == Integer.MIN_VALUE ? -1 : maxLen;
    }
}