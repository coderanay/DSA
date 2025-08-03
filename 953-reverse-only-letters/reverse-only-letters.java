class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr=s.toCharArray();
        int n = s.length();
        int start = 0, end = n-1;
        StringBuilder sb=new StringBuilder();
        while(start < end)
        {
            while(start < end && !Character.isLetter(arr[start])) start++;
            while(start < end && !Character.isLetter(arr[end])) end--;
            while(start < end && Character.isLetter(arr[start]) && Character.isLetter(arr[end]))
            {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
         for(int i=0;i<n;i++)
        {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}