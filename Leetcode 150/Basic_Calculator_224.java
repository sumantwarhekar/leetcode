class Solution {                                            // https://www.youtube.com/watch?v=3AEKyHx3tzU
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int number =0;
        int answer=0;
        int sign=1;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                number = number * 10 + (ch - '0');
            }
            else if(ch == '+'){
                answer += sign * number;
                number =0;
                sign=1;
            }
            else if(ch == '-'){
                answer+= sign * number;
                number =0;
                sign=-1;
            }
            else if(ch == '('){
                st.push(answer);
                st.push(sign);

                answer=0;
                number=0;
                sign=1;
            }
            else if(ch == ')'){
                answer += sign * number;
                number=0;

                int prevsign=st.pop();
                answer *= prevsign;

                int prevans = st.pop();
                answer += prevans;
            }
            else if(ch == ' '){
                continue;
            }
        }
        answer += sign * number;
        return answer;
    }
}