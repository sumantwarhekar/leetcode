class Solution {                                                                    // https://www.youtube.com/watch?v=BM-bu4tJz7U
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int answer=0;

        Map<String, BiFunction<Integer, Integer, Integer>> mp = new HashMap<>();
        mp.put("+", (a, b) -> a+b);
        mp.put("-", (a, b) -> a-b);
        mp.put("*", (a, b) -> a*b);
        mp.put("/", (a, b) -> a/b);

        for(String s : tokens){
            if(mp.containsKey(s)){
                int b = st.pop();
                int a = st.pop();

                answer = mp.get(s).apply(a, b);
                st.push(answer);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}