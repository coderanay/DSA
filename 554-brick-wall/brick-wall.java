class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        int n = wall.size();
        
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int pre = 0;
            int m = wall.get(i).size();
            for(int j=0;j<m-1;j++)
            {
                pre += wall.get(i).get(j);
                map.put(pre, map.getOrDefault(pre,0)+1);
            }
        }   
        int max = 0;
        for(Map.Entry<Integer,Integer> e: map.entrySet())
        {
            max = Math.max(max, e.getValue());
        }

        return n - max;
    }
}