class Solution {
    public String sortSentence(String s) {
        String[] a=s.split(" ");
        int n = a.length;
        String[] arr=new String[n+1];
        for(int i=0;i<n;i++)
        {
            String ans=a[i];
            int idx = ans.charAt(ans.length()-1) - '0';
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<ans.length()-1;j++)
            {
                
                sb.append(ans.charAt(j));
            }
            arr[idx] = sb.toString();
        }


        StringBuilder sb1=new StringBuilder();
        for(int i=1;i<arr.length;i++)
        {
            if(i < arr.length-1)
            {
                sb1.append(arr[i]);
                sb1.append(" ");
            }
        }

        sb1.append(arr[arr.length-1]);

        return sb1.toString();



    }
}