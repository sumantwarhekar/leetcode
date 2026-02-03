class Pair {
    String word;
    int steps;

    public Pair(String word, int steps) {
        this.word = word;
        this.steps = steps;
    }
}

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q = new LinkedList<>();
        Set<String> st = new HashSet<>();

        q.add(new Pair(beginWord, 1));

        for(String word : wordList){
            st.add(word);
        }

        st.remove(beginWord);

        while(!q.isEmpty()){
            Pair entry = q.poll();
            String word = entry.word;
            int steps = entry.steps;

            if(word.equals(endWord))
                return steps;

            for(int i=0;i<word.length();i++){
                for(char ch='a'; ch<='z'; ch++){
                    char[] replacedCharArray = word.toCharArray();
                    replacedCharArray[i] = ch;
                    String replacedWord = new String(replacedCharArray);

                    if(st.contains(replacedWord)){
                        st.remove(replacedWord);
                        q.add(new Pair(replacedWord, steps+1));
                    }
                }
            }
        }
        return 0;
    }
}