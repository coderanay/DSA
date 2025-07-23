class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int top=0, bottom=n-1,right=n-1,left=0;
        int num=1;
        while(top<= bottom && left <= right)
        {
            for(int i=left;i<=right;i++)
                matrix[top][i] = num++;
            top++;
            for(int i=top;i<=bottom;i++)
                matrix[i][right] = num++;
            right--; 
            for(int i=right;i>=left;i--)
                matrix[bottom][i] = num++;
            bottom--;
            for(int i=bottom;i>=top;i--)
                matrix[i][left] = num++;
            left++;     
        }
        return matrix;
    }
}