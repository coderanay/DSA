class Solution {
    public boolean isCircularSentence(String sentence) {
        int n = sentence.length();
        String[] arr = sentence.split(" ");
        if(arr.length <= 1) 
        {
            String word = arr[0];
            if(word.charAt(0) == word.charAt(word.length()-1)) return true;
            else return false;
        }
        boolean vowel = true;
        for(int i=0;i<arr.length-1;i++)
        {
            String piche = arr[i];
            String aage = arr[i+1];
            if(piche.charAt(piche.length()-1) != aage.charAt(0)) return false;
            else vowel = true;
        }
        String first = arr[0];
        String last = arr[arr.length-1];
        if (last.charAt(last.length() - 1) != first.charAt(0)) {
            return false;
        }
        if(vowel) return true;
        return false;
    }
}