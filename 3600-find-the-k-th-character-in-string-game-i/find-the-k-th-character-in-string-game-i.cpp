class Solution {
public:
    string word = "a";
    char kthCharacter(int k) {
        getWord(k);
        cout << word;
        return word[k-1];
    }

    void getWord(int k) {
        string temp;
        int i=0;
        if(k <= 1)
            return;
        else {
            while(word[i] != '\0') {
                temp.append(1,word[i]+1);
                i++;
                k--;
            }
        }
        word.append(temp);
        getWord(k);
    }
};