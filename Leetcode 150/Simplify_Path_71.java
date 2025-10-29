class Solution {                                                                // https://www.youtube.com/watch?v=jFyOrLNvJQM
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Stack<String> stack = new Stack<>();

        for(String st : arr){
            if(st.equals("..") && !stack.empty())
                stack.pop();
            else if(!st.equals("") && !st.equals(".") && !st.equals(".."))
            stack.push(st);
        }

        StringBuilder sb = new StringBuilder();
        for(String str : stack){
            sb.append("/");
            sb.append(str);
        }
        return sb.length()==0 ? "/" : sb.toString();
    }
}