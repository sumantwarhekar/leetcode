class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char[] given = s.toCharArray();

        while (i<j){
            while(i<j && !checkVowel(given[i])){
                i++;
            }
            while(i<j && !checkVowel(given[j])){
                j--;
            }
            if(i>=j){
                break;
            }
            swap(given,i,j);
            i++;
            j--;
        }
        return new String(given);
    }
    public void swap(char[] c, int i, int j){
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
    public boolean checkVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
    }
}   