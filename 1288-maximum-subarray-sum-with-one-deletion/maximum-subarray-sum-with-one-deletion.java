class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        
        int noDelete = arr[0]; 
        int oneDelete = arr[0];
        int ans = arr[0];

        for(int i = 1; i < n; i++){
            oneDelete = Math.max(noDelete, oneDelete + arr[i]); 
            noDelete = Math.max(noDelete + arr[i], arr[i]);
            ans = Math.max(ans, Math.max(noDelete, oneDelete));
        }
        return ans;
    }
}
