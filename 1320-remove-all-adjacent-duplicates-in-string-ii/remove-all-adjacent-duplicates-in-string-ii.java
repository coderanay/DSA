class Solution {
    class Node {
        char data;
        int freq;
        Node(char d,int f)
        {
            data = d;
            freq = f;    
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<Node> st=new Stack<>();
        for(char c: s.toCharArray())
        {
            if(!st.isEmpty() && st.peek().data == c)
            {
                Node rv = st.pop();
                rv.freq++;
                st.push(rv);
            } else 
            {
                st.push(new Node(c,1));
            }


            if(!st.isEmpty() && st.peek().freq == k)
            {
                st.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty())
        {
            Node rv = st.pop();
            int fre = rv.freq;
            while(fre-- > 0)
            {
                sb.append(rv.data);
            }
        }
        return sb.reverse().toString();
    }
}