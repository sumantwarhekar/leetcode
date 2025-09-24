class Solution {                                                                    // https://www.youtube.com/watch?v=ULNj8zXNeC0
    public int romanToInt(String s) {
        int n = s.length();
        HashMap<Character, Integer> values = new HashMap<Character, Integer>();
        values.put('I',1);
        values.put('V',5);
        values.put('X',10);
        values.put('L',50);
        values.put('C',100);
        values.put('D',500);
        values.put('M',1000);

        int result = values.get(s.charAt(n-1));

        for(int i=n-2;i>=0;i--){
            if( values.get(s.charAt(i)) < values.get(s.charAt(i+1)) ){
                result -= values.get(s.charAt(i));
            }
            else{
                result += values.get(s.charAt(i));
            }
        }

        return result;
    }
}