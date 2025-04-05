import java.util.*;                                             https://www.youtube.com/watch?v=h4R6dDsJYp0
class Solution {                                                https://www.youtube.com/watch?v=ybTQoPz02yg
    public String predictPartyVictory(String senate) {
        Queue<Integer> RQ = new LinkedList<>();
        Queue<Integer> DQ = new LinkedList<>();

        for(int i=0;i<senate.length();i++){
            if(senate.charAt(i)=='R'){
                RQ.add(i);
            }
            else{
                DQ.add(i);
            }
        }

        while(!RQ.isEmpty() && !DQ.isEmpty()){
            int r = RQ.poll();
            int d = DQ.poll();

            if(r<d){
                RQ.add(r + senate.length());
            }
            else{
                DQ.add(d + senate.length());
            }
        }
        return (RQ.size() > DQ.size()) ? "Radiant" : "Dire";
    }
}