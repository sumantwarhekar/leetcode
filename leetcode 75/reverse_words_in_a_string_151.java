// 1st Approach: hard coded
class Solution {
    public String reverseWords(String s) {
        String[] given = s.split(" ");

        StringBuilder answer = new StringBuilder();

        for(int i=0;i<given.length;i++){
            if(given[i].length() == 0){
                continue;
            }
            answer.insert(0,given[i]);
            answer.insert(0," ");
        }
        return answer.toString().trim();
    }
}

// 2nd Approach: two pointer method
class Solution2 {
    public String reverseWords(String s) {
       String[] given = s.trim().split("\\s+");

       int i=0, j=given.length-1;

       while(i<j){
        String temp = given[i];
        given[i] = given[j];
        given[j] = temp;
        i++;
        j--;
       }
       return String.join(" ",given); 
    }
}
