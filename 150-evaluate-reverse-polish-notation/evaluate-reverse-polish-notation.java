class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        String rev = "+/-*";
        for(int i=0;i<tokens.length;i++)
        {
            int val = 0;
            String token = tokens[i];
            if(rev.contains(token))
            {
                int b = st.pop(); 
                int a = st.pop();
                
                 switch (token) {
                    case "+": st.push(a + b); break;
                    case "-": st.push(a - b); break;
                    case "*": st.push(a * b); break;
                    case "/": st.push(a / b); break; 
                }
            } else 
            {
                st.push(Integer.parseInt(token));
            }
        }
        return st.peek();
    }
}