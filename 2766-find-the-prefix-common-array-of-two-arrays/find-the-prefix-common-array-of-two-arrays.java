class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] newArr = new int[n];
        boolean[] isPresentA = new boolean[n+1];
        boolean[] isPresentB = new boolean[n+1];
        for(int i=0;i<n;i++)
        {
            isPresentA[A[i]] = true;
            isPresentB[B[i]] = true;
            int cnt = 0;
            for(int j=1;j<=n;j++)
            {
                if(isPresentA[j] && isPresentB[j])
                {
                    cnt++;
                }
                
            }
            newArr[i] = cnt;
        }

        return newArr;
    }
}