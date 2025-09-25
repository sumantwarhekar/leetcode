class Solution {                                                // https://www.youtube.com/watch?v=wtOQaovlvhY
    public String longestCommonPrefix(String[] strs) {
        StringBuilder answer = new StringBuilder();
        Arrays.sort(strs);
        int n = strs.length;

        char[] first = strs[0].toCharArray();
        char[] last = strs[n-1].toCharArray();

        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i])
                break;
            else
                answer.append(first[i]);
        }
        return answer.toString();
    }
}