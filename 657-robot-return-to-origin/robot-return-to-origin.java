class Solution {
    public boolean judgeCircle(String moves) {
        int u = 0;
        int l=0;
        for(char x: moves.toCharArray())
        if(x=='R') l+=-1;
        else if(x=='L') l+=1;
        else if(x=='D') u+=-1;
        else u+=1;
        return u==0 && l==0;
    }
}