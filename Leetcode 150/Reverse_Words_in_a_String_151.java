class Solution {                                                // https://www.youtube.com/watch?v=tX-ZcKTNwYk
    public String reverseWords(String s) {
        String[] words = s.split(" +");
        StringBuilder answer = new StringBuilder();

        int n = words.length;
        for(int i=n-1;i>=0;i--){
            answer.append(words[i]);
            answer.append(" ");
        }
        return answer.toString().trim();
    }
}