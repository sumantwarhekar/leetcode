class Solution {                                    // https://www.youtube.com/watch?v=EDEwDYYkC2E
    public int lengthOfLastWord(String s) {
        String trimmed = s.trim();
        int n = trimmed.length();
        int answer = 0;
        for(int i=n-1;i>=0;i--){
            if(trimmed.charAt(i) != ' ')
                answer++;
            else
                break;
        }
        return answer;
    }
}