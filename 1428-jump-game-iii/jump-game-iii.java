class Solution {
    public boolean solve(int[] arr, int idx) {
        int n = arr.length;
        if (idx < 0 || idx >= n || arr[idx] < 0) {
            return false;
        }
        if (arr[idx] == 0) {
            return true;
        }

        arr[idx] *= -1;
        boolean a = solve(arr, idx - arr[idx]);
        boolean b = solve(arr, idx + arr[idx]);

        return a || b;
    }

    public boolean canReach(int[] arr, int start) {
        return solve(arr, start);
    }
}