class Solution {
    public List<Integer> findPeaks(int[] arr) {
        int n = arr.length;
        List<Integer> ls=new ArrayList<>();
        for(int i=1;i<n-1;i++)
        {
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]) ls.add(i);
        }
        return ls;
    }
}