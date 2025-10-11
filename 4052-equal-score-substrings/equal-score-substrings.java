class Solution {
    public boolean isFound(HashMap<Character,Integer> map, String left,String right)
    {
        int sumL = 0, sumR=0;
        for(int i=0;i<left.length();i++)
        {
            sumL += map.get(left.charAt(i));
        }
        for(int j=0;j<right.length();j++)
        {
            sumR += map.get(right.charAt(j));
        }
        if(sumL == sumR) return true;
        return false;
    }
    public boolean scoreBalance(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('a',1);
        map.put('b',2);
        map.put('c',3);
        map.put('d',4);
        map.put('e',5);
        map.put('f',6);
        map.put('g',7);
        map.put('h',8);
        map.put('i',9);
        map.put('j',10);
        map.put('k',11);
        map.put('l',12);
        map.put('m',13);
        map.put('n',14);
        map.put('o',15);
        map.put('p',16);
        map.put('q',17);
        map.put('r',18);
        map.put('s',19);
        map.put('t',20);
        map.put('u',21);
        map.put('v',22);
        map.put('w',23);
        map.put('x',24);
        map.put('y',25);
        map.put('z',26);
        int n = s.length();
        if(n == 2) 
        {
            if(s.charAt(0)== s.charAt(1)) return true;
            else return false;
        }
        if(n == 0) return false;
        for(int i=0;i<n;i++)
        {
            String left = s.substring(0,i);
            String right = s.substring(i);
            if(isFound(map,left,right)) return true;
        }
        return false;
    }
}