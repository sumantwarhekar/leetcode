class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder answer = new StringBuilder();
        int indexOfChar = word.indexOf(ch);
        for (int i = indexOfChar; i >= 0; i--) {
            answer.append(word.charAt(i));
        }
        for (int i = indexOfChar + 1; i < word.length(); i++) {
            answer.append(word.charAt(i));
        }
        return answer.toString();
    }
}