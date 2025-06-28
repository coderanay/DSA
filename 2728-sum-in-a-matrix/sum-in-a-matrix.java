class Solution {
    public int matrixSum(int[][] nums) {     
        for (int[] arr : nums)  Arrays.sort(arr);
       
        int n = nums.length, sum = 0;
       
        for (int j = nums[0].length - 1; j >= 0; j--) {
            int max = -1;
            for (int i = 0; i < n; i++) {
                max = Math.max(max, nums[i][j]);
            }
            sum += max;
        }
        return sum;

    }
}