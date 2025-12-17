class Solution {
    public String reorderSpaces(String text) {
        int n = text.length();
        String[] arr = text.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(char ch:text.toCharArray())
        {
            if(ch == ' ') count++;
        }
        int m = arr.length;
        if (m == 1) {
            StringBuilder sb1 = new StringBuilder(arr[0]);
            while (count-- > 0) sb1.append(" ");
            return sb1.toString();
        }
        int cnt = count/(m-1);
        int extra = count % (m-1);
        text = text.trim();
        System.out.println(text);
          for (int i = 0; i < m; i++) {
            sb.append(arr[i]);
            if (i < m - 1) {
                for (int k = 0; k < cnt; k++) sb.append(" ");
            }
        }
        while(extra-- > 0) sb.append(" ");
        return sb.toString();
    }
}