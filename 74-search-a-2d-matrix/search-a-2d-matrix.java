class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int top=0;
        int right=col-1;
        while(top< row && right>=0)
        {
            int ele = matrix[top][right];
                if(ele == target) return true;
                else if(ele < target) top++;
                else right--;
        }
        return false;
    }
}