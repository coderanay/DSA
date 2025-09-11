class Solution {
    public boolean isVowel(char s)
    {
        if(s == 'a' || s == 'e' || s == 'i' || s == 
        'o' || s == 'u' || s == 'A' || s == 'E' || s == 'I' || s == 
        'O' || s == 'U') return true;
        return false;
    }
    public String reverseVowels(String s) {
        StringBuilder sb=new StringBuilder();
        int n = s.length();
        int start = 0, end = n-1;
        char[] arr = s.toCharArray();
        while(start < end)
        {
            while(start < end && !isVowel(arr[start])) start++;
            while( start < end && !isVowel(arr[end])) end--;
            if(start < end)
            {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        for(int i = 0;i<n;i++)
        {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}