class Solution {
    public String convertToBase7(int num) {
        StringBuilder answer = new StringBuilder();
        int abs = Math.abs(num);
        while (abs / 7 != 0) {
            answer.append(abs % 7);
            abs /= 7;
        }
        answer.append(abs);
        if (num < 0)
            answer.append('-');
        return answer.reverse().toString();
    }
}