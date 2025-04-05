import java.util.*;                                                         // https://www.youtube.com/watch?v=IrkJeGHszJ8
class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch!=']'){
                stack.push(ch);
            }
            else{
                StringBuilder sb = new StringBuilder();
                while(!stack.isEmpty() && Character.isLetter(stack.peek())){
                    sb.insert(0,stack.pop());
                }
                String sub = sb.toString();
                stack.pop();

                sb = new StringBuilder();
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                    sb.insert(0,stack.pop());
                }

                int repeatCount = Integer.valueOf(sb.toString());

                while(repeatCount>0){
                    for(char c : sub.toCharArray()){
                        stack.push(c);
                    }
                    repeatCount--;
                }
            }
        }
        StringBuilder answer = new StringBuilder();
        while(!stack.isEmpty()){
            answer.insert(0,stack.pop());
        }
        return answer.toString();
    }
}