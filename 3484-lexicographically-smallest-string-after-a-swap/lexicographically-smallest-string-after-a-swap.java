class Solution {
    public String getSmallestString(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        if(n == 2)
        {
            int num1 = arr[0] - '0';
            int num2 = arr[1]  - '0';
            if(num1 % 2 == 0 && num2 % 2 == 0 && num1 > num2)
            {
                char temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp;
            } else if(num1 % 2 == 1 && num2 % 2 == 1 && num1 > num2)
            {
                char temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp;
            }
            String res = new String(arr);
            return res;
        }
        for(int i=0;i<n-1;i++)
        {
            char c1 = arr[i];
            char c2 = arr[i+1];
            int num1 = c1 - '0';
            int num2 = c2 - '0';
            if(num1 % 2 == 0 && num2 % 2 == 0 && num1 > num2)
            {
                char temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                break; 
            } else if(num1 % 2 == 1 && num2 % 2 == 1 && num1 > num2)
            {
                char temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                break;
            }
        }
        String st = new String(arr);
        return st;
    }
}