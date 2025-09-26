class Solution {                                                // https://www.youtube.com/watch?v=OO_wrniY8Ts
    public String convert(String s, int numRows) {
        String[] answer = new String[numRows];
        for(int i=0;i<numRows;i++){
            answer[i]="";
        }

        int i=0;
        while(i<s.length()){
            for(int j=0;j<numRows && i<s.length();j++){
                answer[j] += s.charAt(i++);
            }

            for(int k=numRows-2;k>0 && i<s.length();k--){
                answer[k] += s.charAt(i++);
            }
        }

        String result = "";
        for(String str : answer){
            result += str;
        }

        return result;
    }
}