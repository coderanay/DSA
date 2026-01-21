class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Stack<String> st=new Stack<>();
        for(String c:arr)
        {
            if(c.equals("") || c.equals(".")) continue;
            else if(c.equals("..")) 
            {
                if(!st.isEmpty()) st.pop();
            }
            else st.push(c);
        }

        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty())
        {
            sb.insert(0,"/" + st.pop());
        }

        return sb.length() == 0 ? "/" : sb.toString();
    }
}