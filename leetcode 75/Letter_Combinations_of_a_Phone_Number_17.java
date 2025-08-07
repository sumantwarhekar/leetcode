class Solution {
    List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0)
            return result;

        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        StringBuilder temp = new StringBuilder();
        solve(0, digits, temp, map);
        return result;
    }

    private void solve(int idx, String digits, StringBuilder temp, Map<Character, String> map) {
        if (idx >= digits.length()) {
            result.add(temp.toString());
            return;
        }

        char ch = digits.charAt(idx);
        String letters = map.get(ch);

        for (int i = 0; i < letters.length(); i++) {
            temp.append(letters.charAt(i));
            solve(idx + 1, digits, temp, map);
            temp.deleteCharAt(temp.length() - 1); // backtrack
        }
    }
}