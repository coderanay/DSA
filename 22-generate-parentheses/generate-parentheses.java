class Solution {

    public void validParenthesis(int open, int close, List<String> res, StringBuilder temp, int n)
    {
        if(open == n && close == n)
        {
            res.add(temp.toString());
            return;
        }

        if(open < n)
        {
            temp.append("(");
            validParenthesis(open+1,close,res,temp,n);
            temp.deleteCharAt(temp.length()-1);
        }

        if(close < open)
        {
            temp.append(")");
            validParenthesis(open,close+1,res,temp,n);
            temp.deleteCharAt(temp.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        validParenthesis(0,0,res,temp,n);
        return res;
    }
}