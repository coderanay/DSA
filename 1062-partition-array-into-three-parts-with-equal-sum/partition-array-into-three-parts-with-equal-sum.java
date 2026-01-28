class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int n = arr.length;
        int sum = 0;
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            sum += arr[i];
        }
        if(sum % 3 != 0) return false;
        int k = sum / 3;
        sum = 0;
        for(int i=0;i<n;i++)
        {
            sum += arr[i];
            if(sum == k) 
            {
                cnt++;
                sum = 0;
            }
        }
        return cnt >= 3 ? true : false;
    }
}