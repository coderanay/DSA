class Solution {
    public static void reverse(int[] nums,int start,int end)
    {
        while(start < end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int pivot = -1;
        for(int i = n-2; i >= 0; i--) {
            if(arr[i] < arr[i+1]) {
                pivot = i;
                break;
            }
        }
        if(pivot == -1) {
            reverse(arr, 0, n-1);
        } else {
            int swap = -1;
            for(int j = n-1; j > pivot; j--) {
                if(arr[j] > arr[pivot]) {
                    swap = j;
                    break;
                }
            }
            int temp = arr[pivot];
            arr[pivot] = arr[swap];
            arr[swap] = temp;
             reverse(arr, pivot+1, n-1);    
        }    
    }
}