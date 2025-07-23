class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int top=0;
        int right=col-1;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                int ele = matrix[i][j];
                if(ele == target) return true;
                else if(ele >= target) top++;
                else right--;
            }
        }
        return false;
    }
}