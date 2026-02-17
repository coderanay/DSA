class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        for(int h=0;h<=11;h++)
        {
            for(int m=0;m<=59;m++)
            {
                if(Integer.bitCount(h) + Integer.bitCount(m) == turnedOn)
                {
                    String hour = String.valueOf(h);
                    String min = m <= 9 ? "0" + String.valueOf(m) : String.valueOf(m);
                    result.add(hour + ":" + min);
                }
            }
        }

        return result;
    }
}