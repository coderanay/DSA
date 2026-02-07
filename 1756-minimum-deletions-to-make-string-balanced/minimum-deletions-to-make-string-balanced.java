class Solution {
    public int minimumDeletions(String s) {
        Stack<Character> st=new Stack<>();
        int n = s.length();
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(!st.isEmpty() && (s.charAt(i) == 'a' && st.peek() == 'b'))
            {
                cnt++;
                st.pop();
            }
            if(s.charAt(i) != 'a') 
            {
                st.push(s.charAt(i));
            }
        }

        return cnt;
    }
}