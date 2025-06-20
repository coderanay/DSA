class Solution {
    public int kthSmallest(int[][] matrix, int k) {
         PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                pq.add(matrix[i][j]);
            }
        }
        int value = 0;
        while(k > 0)
        {
           value = pq.poll();
            k--;
        }
        return value;
    }
}