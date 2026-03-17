class Solution {
    public int largestSubmatrix(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[][] height = new int[m][n];
        
        for(int i = 0; i < n; i++){
            height[0][i] = matrix[0][i];
        }
        
        for(int i = 1; i < m; i++){
            for(int j = 0; j < n; j++){
                height[i][j] = matrix[i][j] == 1 ? height[i-1][j] + 1 : 0;
            }
        }
        
        int maxArea = 0;
        
        for(int i = 0; i < m; i++){
            
            List<Integer> curr = new ArrayList<>();
            
            for(int j = 0; j < n; j++){
                curr.add(height[i][j]);
            }
            
            Collections.sort(curr, Collections.reverseOrder());
            
            for(int j = 0; j < n; j++){
                maxArea = Math.max(maxArea, curr.get(j) * (j + 1));
            }
        }
        
        return maxArea;
    }
}