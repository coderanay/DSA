class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;
        int result=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                list.add(grid[i][j]);
            }
        }

        Collections.sort(list);
        int size = list.size();
        int target = list.get(size/2);

        for(int num: list)
        {
            if(num % x != target % x) return -1;
            result += Math.abs(target-num)/x;
        }
        return result;
    }
}