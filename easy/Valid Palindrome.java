class Solution {
    public boolean isPalindrome(String s) {
        String given = s.toLowerCase();
        StringBuilder cleanStr = new StringBuilder();
        for (int i = 0; i < given.length(); i++) {
            if ((given.charAt(i) >= 'a' && given.charAt(i) <= 'z')
                    || (given.charAt(i) >= '0' && given.charAt(i) <= '9'))
                cleanStr.append(given.charAt(i));
        }
        int start = 0;
        int end = cleanStr.length() - 1;
        while (start <= end) {
            if (cleanStr.charAt(start) != cleanStr.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}