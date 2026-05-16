class Solution {
    public int calculate(String s) {
        int n = s.length();
        int num = 0;
        char op = '+';
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++) {
            char charVal = s.charAt(i);

            if(Character.isDigit(charVal)) {
                num = num * 10 + (charVal - '0');
            }

            if((!Character.isDigit(charVal) && charVal != ' ') || i == n - 1) {
                if(op == '+') {
                    st.push(num);
                } else if(op == '-') {
                    st.push(-num);
                } else if(op == '*') {
                    st.push(st.pop() * num);
                } else if(op == '/') {
                    st.push(st.pop() / num);
                }

                op = charVal;
                num = 0;
            }
        }

        int sum = 0;
        while(!st.isEmpty()) {
            sum += st.pop();
        }

        return sum;
    }
}