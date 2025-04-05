// 1st Approach With List                               https://www.youtube.com/watch?v=zLsgo7CQtu8
import java.util.*;
class RecentCounter {
    List<Integer> list;
    int i;
    int j;
    public RecentCounter() {
        list = new ArrayList<>();
        i=0;
        j=-1;
    }
    
    public int ping(int t) {
        list.add(t);
        j++;
        while(i<j && list.get(j)-3000 > list.get(i)){
            i++;
        }
        return j-i+1;
    }
}

// 2nd Approach Ideal: With Queue               https://www.youtube.com/watch?v=C6_pFE9qeSQ
class RecentCounter {
    Queue<Integer> q;
    public RecentCounter() {
       q = new LinkedList<>(); 
    }
    
    public int ping(int t) {
        q.add(t);
        while(!q.isEmpty() && t-3000>q.peek()){
            q.poll();
        }
        return q.size();
    }
}