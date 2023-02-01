class Solution {
    public String truncateSentence(String s, int k) {
        String answer = "";
        int space = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == (' ')) {
                space++;
                if (space == k)
                    break;
                answer += s.charAt(i);
            } else
                answer += s.charAt(i);
        }
        return answer;
    }
}