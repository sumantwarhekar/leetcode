// 1st Approach: Direct https://www.youtube.com/watch?v=A8LVjVQPaNs
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();

        String remainingString="";

        int minlength = Math.min(length1,length2);

        if(minlength==length1){
            remainingString = word2;
        }

        if(minlength==length2){
            remainingString=word1;
       }

        char chars1[] = word1.toCharArray();
        char chars2[] = word2.toCharArray();

        StringBuilder answer = new StringBuilder();

        for(int i=0;i<minlength;i++){
            answer.append(chars1[i]);
            answer.append(chars2[i]);
        }
        answer.append(remainingString.substring(minlength));
        return answer.toString();
    }
}

// 2nd Approach: Two Pointer Method https://www.youtube.com/watch?v=I9gPqVj0BHI
class Solution2 {
    public String mergeAlternately(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();

        StringBuilder answer = new StringBuilder();

        int i=0,j=0;

        while(i<length1 || j<length2){
            if(i<length1)
                answer.append(word1.charAt(i++));
            if(j<length2)
                answer.append(word2.charAt(j++));
        }
        return answer.toString();
    }
}