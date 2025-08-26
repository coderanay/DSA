class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int n = dimensions.length;
        int longA = 0;
        int ans = 0;
        int area=0;
        for(int i=0;i<n;i++)
        {
            int length = dimensions[i][0];
            int width = dimensions[i][1];
            area =length*length+width*width;
            if(ans < area)
            {
                ans = area;
                longA = length * width;
            } else if(ans == area)
            {
                longA = Math.max(longA,length*width);
            }
        }
        return longA;
    }
}