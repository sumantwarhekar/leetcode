class Solution {
    public int mostWordsFound(String[] sentences) {
        int answer = 0;
        for(int i=0;i<sentences.length;i++){
            int space = 0;
            for(int j = 0; j <sentences[i].length();j++){
                if(sentences[i].charAt(j)==' '){
                    space++;
                }
            }
            if(space > answer){
                answer = space;
            }
        }
        return answer+1;
    }
}