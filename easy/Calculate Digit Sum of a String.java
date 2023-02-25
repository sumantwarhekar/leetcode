class Solution {
    public String digitSum(String s, int k) {
        while (s.length() > k) {
            String str = "";
            char[] ch = s.toCharArray();
            for (int i = 0; i < ch.length; i += k) {
                int sum = 0;
                for (int j = i; j < i + k && j < ch.length; j++) {
                    sum += Integer.parseInt("" + ch[j]);
                }
                str += sum;
            }
            s = str;
        }
        return s;
    }
}