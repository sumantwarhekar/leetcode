// Solution 1
class Solution1 {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}

// Solution 2
class Solution2 {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty() || haystack.equals(needle))
            return 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            String checkString = haystack.substring(i, i + needle.length());
            if (checkString.equals(needle))
                return i;
        }
        return -1;
    }
}