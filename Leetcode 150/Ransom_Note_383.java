class Solution {                                                        // https://www.youtube.com/watch?v=5tkofg3RXOg
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length())
            return false;

        Map<Character, Integer> rc = new HashMap<>();
        for(char ch : ransomNote.toCharArray()){
            rc.put(ch, rc.getOrDefault(ch,0)+1);
        }

        Map<Character, Integer> mc = new HashMap<>();
        for(char ch : magazine.toCharArray()){
            mc.put(ch, mc.getOrDefault(ch,0)+1);
        }

        for(char ch : rc.keySet()){
            int countInMagazine = mc.getOrDefault(ch,0);
            int countInRansom = rc.get(ch);
            if(countInMagazine < countInRansom){
                return false;
            }
        }
        return true;
    }
}