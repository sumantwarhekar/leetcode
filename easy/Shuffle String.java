class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ch = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            ch[indices[i]] = s.charAt(i);
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            answer.append(ch[i]);
        }
        return answer.toString();
    }
}