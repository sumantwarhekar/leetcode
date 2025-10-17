class Solution {                                                // https://www.youtube.com/watch?v=ogTMIFPjNkQ
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;

        Map<Character, Character> mapping = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char original = s.charAt(i);
            char replace = t.charAt(i);

            if(!mapping.containsKey(original)){
                if(!mapping.containsValue(replace)){
                    mapping.put(original, replace);
                }
                else{
                    return false;
                }
            }
            else{
                char mapped = mapping.get(original);
                if(mapped != replace){
                   return false; 
                }  
            }
        }

        return true;
    }
}