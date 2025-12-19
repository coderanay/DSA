class Solution {
    public int binarySearch(int[] arr, int low, int high,int target)
    {
        if(low > high) return -1;
        int mid = low + (high-low)/2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] > target) 
        {
            high = mid -1;
            return binarySearch(arr,low,high,target);
        } else 
        {
            low = mid + 1;
            return binarySearch(arr,low,high,target);
        }
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low=0 , high = n-1;
        int a = binarySearch(nums,low,high,target);
        return a;
    }
}