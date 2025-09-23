class Solution {
    public int compareVersion(String version1, String version2) {
        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");
        int n = arr1.length;
        int m = arr2.length;
        System.out.println(n);
        int count = Math.max(n,m);
        for(int i=0;i<count;i++)
        {
            int a = i <arr1.length ? Integer.parseInt(arr1[i]) : 0;
            int b =i<arr2.length ? Integer.parseInt(arr2[i]) : 0;
            if(a < b) return -1;
            else if(a > b) return 1;
        }   
        return 0;
    }
}