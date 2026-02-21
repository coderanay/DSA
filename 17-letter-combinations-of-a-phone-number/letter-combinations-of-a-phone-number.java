class Solution {
    private Map<Character, String> map = new HashMap<>();

    public Solution() {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }

    public void fun(String digits,int idx, int n, List<String> res, StringBuilder sb)
    {
        if(idx == n)
        {
            res.add(sb.toString());
            return;
        }

        String choice = map.get(digits.charAt(idx));
        for(int i=0;i<choice.length();i++)
        {
            sb.append(choice.charAt(i));
            fun(digits,idx+1,n,res,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        return;
    }

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int n = digits.length();
        fun(digits,0,n,res,sb);
        return res;
    }
}