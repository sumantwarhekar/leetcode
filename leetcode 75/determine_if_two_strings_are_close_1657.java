import java.util.*;
//1st Approach : Arrays, sorting, counting
class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length())
            return false;

        int freq1[] = new int[26];
        int freq2[] = new int[26];

        for(char ch : word1.toCharArray()){
            freq1[ch-'a']++;
        }
        for(char ch : word2.toCharArray()){
            freq2[ch-'a']++;
        }

        for(int i=0;i<freq1.length;i++){
            if( (freq1[i]==0 && freq2[i]!=0) || (freq2[i]==0&&freq1[i]!=0) )
                return false;
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);
        return Arrays.equals(freq1,freq2);
    }
}
// https://www.youtube.com/watch?v=GC1AWJgnwio

// 2nd Approach: Hashmap
class Solution2 {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;

        // HashMap to store character frequencies
        HashMap<Character, Integer> freq1 = new HashMap<>();
        HashMap<Character, Integer> freq2 = new HashMap<>();

        // Count frequencies for word1
        for (char c : word1.toCharArray()) freq1.put(c, freq1.getOrDefault(c, 0) + 1);
        // Count frequencies for word2
        for (char c : word2.toCharArray()) freq2.put(c, freq2.getOrDefault(c, 0) + 1);

        // Check if both words contain the same set of characters
        if (!freq1.keySet().equals(freq2.keySet())) return false;

        // HashMap to store the count of frequencies
        HashMap<Integer, Integer> countMap1 = new HashMap<>();
        HashMap<Integer, Integer> countMap2 = new HashMap<>();

        // Count how many times each frequency appears
        for (int val : freq1.values()) countMap1.put(val, countMap1.getOrDefault(val, 0) + 1);
        for (int val : freq2.values()) countMap2.put(val, countMap2.getOrDefault(val, 0) + 1);

        // If frequency distributions match, return true
        return countMap1.equals(countMap2);
    }
}