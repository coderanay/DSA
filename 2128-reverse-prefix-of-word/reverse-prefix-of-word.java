class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder();
        int index = word.indexOf(ch);
        char[] arr = word.toCharArray();
        int n = arr.length;
        int start = 0, end = index;
        while(start < end)
        {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }    
        for(int i=0;i<n;i++)
        {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}