class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++)
        {
            char c = s.charAt(i);
            if(c != ')')
            {
                st.push(c);
            } else 
            {
                List<Character> al=new ArrayList<>();
                while(!st.isEmpty() && st.peek()!= '(')
                {
                    al.add(st.pop());
                }
                st.pop();
                for(char ch: al) st.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}