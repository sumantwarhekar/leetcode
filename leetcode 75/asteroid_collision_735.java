class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> ast = new Stack<>();

        for(int i : asteroids){
            boolean isNegative = true;
            while(!ast.empty() && i<0 && ast.peek()>0){
                if(-i > ast.peek()){
                    ast.pop();
                }
                else if(-i < ast.peek()){
                    isNegative = false;
                    break;
                }
                else{
                    isNegative = false;
                    ast.pop();
                    break;
                }
            }
            if(isNegative){
                ast.push(i);
            }
        }
        int i=0;
        int[] answer = new int[ast.size()];
        for( int element : ast){
            answer[i]=element;
            i++;
        }
        return answer;
    }
}