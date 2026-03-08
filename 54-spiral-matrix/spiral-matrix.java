class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int sr = 0, er = n-1;
        int sc = 0, ec = m-1;
        List<Integer> al=new ArrayList<>();
        while(sr <= er && sc <= ec)
        {

            for(int j=sc;j<=ec;j++)
            {
                al.add(matrix[sr][j]);
            }
            for(int i=sr+1;i<=er;i++)
            {
                al.add(matrix[i][ec]);
            }
            if(sr != er)
            {
                for(int j=ec-1;j>=sc;j--)
                {
                    al.add(matrix[er][j]);
                }
            }
            if(sc != ec)
            {
                for(int i=er-1;i>=sr+1;i--)
                {
                    al.add(matrix[i][sc]);
                }
            }   
            sr++;
            er--;
            sc++;
            ec--;
        }
        return al;
    }
}