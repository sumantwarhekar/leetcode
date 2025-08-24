class Trie {                                                        // https://www.youtube.com/watch?v=YXefcFMpemo
                                                                    // https://www.youtube.com/watch?v=dBGUmUQhjaM
    static class trieNode{
        trieNode[] children = new trieNode[26];
        boolean isEndOfWord = false;
    }

    private final trieNode root;

    public Trie() {
        root = new trieNode();
    }
    
    public void insert(String word) {
        trieNode crawler = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            int idx = ch - 'a';
            if(crawler.children[idx]==null){
                crawler.children[idx] = new trieNode();
            }
            crawler = crawler.children[idx];
        }
        crawler.isEndOfWord = true;
    }
    
    
    public boolean search(String word) {
        trieNode crawler = root;

        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            int idx = ch - 'a';
            if(crawler.children[idx]==null){
                return false;
            }
            crawler = crawler.children[idx];
        }
        return crawler.isEndOfWord;
    }
    
    public boolean startsWith(String prefix) {
        trieNode crawler = root;
        for(int i=0;i<prefix.length();i++){
            char ch = prefix.charAt(i);
            int idx = ch - 'a';
            if(crawler.children[idx]==null){
                return false;
            }
            crawler = crawler.children[idx];
        }
        return true;
    }
}