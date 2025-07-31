class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i) == ')')
            {
                if(st.size()>0 && st.peek() == '(') st.pop();
                else st.push(s.charAt(i));
            }
            else st.push(s.charAt(i));
        }
        return st.size();
    }
}