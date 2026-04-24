class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int move = 0;
        int score = 0;
        for(char ch: moves.toCharArray())
        {
            if(ch == 'L')
            {
                move--;
            } else if(ch == 'R')
            {
                move++;
            } else score++;
        }

        if(move < 0)
        {
            while(score-- > 0)
            {
                move--;
            }
        } else 
        {
            while(score-- > 0)
            {
                move++;
            }
        }


        return Math.abs(move);
    }
}