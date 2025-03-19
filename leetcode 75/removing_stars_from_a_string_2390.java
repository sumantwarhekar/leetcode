import java.util.*;
class Solution {                                    // https://www.youtube.com/watch?v=ECe35TFbzTI
    public String removeStars(String s) {
        Stack<Character> letters = new Stack<>();
        StringBuilder answer = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(ch=='*')
                letters.pop();
            else
                letters.push(ch);
        }

        while(!letters.isEmpty()){
            answer.append(letters.pop());
        }
        return answer.reverse().toString();
    }
}