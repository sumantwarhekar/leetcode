class Solution {                                                            // https://www.youtube.com/watch?v=ANmSVWeOsUA
    public boolean isPalindrome(String s) {
        String clean = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");

        int n = clean.length();
        int start = 0;
        int end = n-1;

        while(start<=end){
            if(clean.charAt(start) != clean.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true; 
    }
}