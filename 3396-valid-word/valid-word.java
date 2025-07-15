class Solution {
  public boolean isValid(String word) {
    if (word.length() < 3) return false;
    boolean hasV = false, hasC = false;
    for (char c : word.toCharArray()) {
      if (!Character.isLetterOrDigit(c)) return false;
      if (Character.isLetter(c)) {
        char lc = Character.toLowerCase(c);
        if ("aeiou".indexOf(lc) >= 0) hasV = true;
        else hasC = true;
      }
    }
    return hasV && hasC;
  }
}
